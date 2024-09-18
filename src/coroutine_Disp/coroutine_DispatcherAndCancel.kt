package coroutine_Disp

import kotlinx.coroutines.*
import kotlin.random.Random


/**
 * Написать класс Person с полями имени и зарплаты.
 * Создать список personList типа Person для их хранения.
 *
 * Написать класс PersonManager,
 * в котором будут функция добавления Person в список addPerson(person: Person).
 *
 * Создать Map<Person, Int> resultList.
 *
 * Написать функцию addPassword(),
 * которая будет добавлять в созданный словарь Person и
 * добавлять шестизначный пароль, сгенерированный в этой функции в качестве значения.
 * Эта функция должна добавлять данные элементы с задержкой в 500L для имитации создания надежного пароля.
 *
 * Написать функцию readDataPersonList(),
 * выводящую данные созданного map в виде ("Сотрудник: ${i.key}; пароль: ${i.value}"
 * с временной задержкой в 1000L.
 *
 * В главной функции
 * программа запускается с приветствия: "Программа работы с базой данных сотрудников"
 * и через секундную задержку предлагает выполнить порядок действий:
 *  "Добавить сотрудника:\n1.Да\n2.Нет".
 *  В цикле можно добавлять бесконечное количество сотрудников,
 *  вводя данные имени и зарплаты с консоли и используя функцию addPerson(person: Person).
 *  После добавления каждого сотрудника, предлагать продолжение работы или выход с
 *  чтением базы данных: "Добавить сотрудника:\n1.Да\n2.Прочитать базу данных"
 *
 *  В случае прекращения работы в функции main запускается корутина,
 *  которая внутри выполняет функции добавления пароля сотруднику и
 *  вывода в консоль получившегося в результате map. Эти функции описаны были выше.
 *
 *  Написать еще одну корутину, которая будет выполняться параллельно с той.
 *  В ней указано условие отмены работы предыдущей корутины,
 *  это ввод с консоли значения равного «0».
 *  Т.е. при вводе «0» добавление пароля и вывод данных прекращаются и выходит сообщение
 *  "Завершение полной работы".
 *
 */
var personList: MutableList<Person> = mutableListOf()
var resultList: Map<Person, Int> = mutableMapOf()
suspend fun main() = coroutineScope {
    mainMenu@ while (true) {
        println("Программа работы с базой данных сотрудников")
        delay(1000L)
        println("\n1.Добавить сотрудника.\n2.Вывести список сотрудников\n3.Выйти из программы.")
        try {
            var choice = readln().toInt()
            when (choice) {
                1 -> {
                    makePersonList()
                    var cancellationJob: Job? = null

                    val job: Job = launch {
                        try {
                            // Ждем, пока cancellationJob будет инициализирована
                            while (cancellationJob == null) {
                                delay(50) // Ждем и проверяем каждые 50 миллисекунд
                            }
                            resultList = personList.addPassword()
                            readDataPersonList()
                            if (cancellationJob?.isActive == true) {
                                println("Для продолжения нажмите Enter")
                            }
                            cancellationJob?.cancelAndJoin()
                        }finally {
                            println("Завершение полной работы.")
                        }

                    }
                     cancellationJob = launch(Dispatchers.IO) {
                        while (job.isActive) {
                            println("Для завершения нажмите 0")
                            var cancellJob = readln().toIntOrNull()
                            if (cancellJob == 0) {
                                job.cancelAndJoin()
                            } else break
                        }
                    }
                   // cancellationJob.cancelAndJoin()
                    //job.join()
                    joinAll(job, cancellationJob)

                }

                2 -> {
                    if (resultList.isEmpty()) {
                        println("В базе нет сотрудников.")
                    } else {
                        readDataPersonList()
                    }
                }

                3 -> break@mainMenu
                else -> println("Ошибка выбора.")
            }
        } catch (e: Exception) {
            println("Ошибка выбора.")
        }
    }
}

fun makePersonList() {
    var choice: Int? = 1
    menu@ while (choice != 2) {
        print("Введите имя: ")
        val name = readln()
        if (name == "") {
            println("Ошибка. Имя не может быть пустым.")
            continue@menu
        } else if (name.any { it.isDigit() }) {
            println("Ошибка. Имя не может содержать цифры.")
            continue@menu
        }
        print("Введите зарплату: ")
        var salary = readln().toIntOrNull()
        while (salary == null) {
            print("Ошибка. Введите корректную зарплату: ")
            salary = readln().toIntOrNull()
        }
        PersonManager().addPerson(Person(name, salary))
        println("Добавить сотрудника:\n1.Да\n2.Прочитать базу данных")
        choice = readln().toIntOrNull()
        while (choice != 1 && choice != 2) {
            println("Ошибка. Повторите выбор.")
            println("Добавить сотрудника:\n1.Да\n2.Прочитать базу данных")
            choice = readln().toIntOrNull()
        }
    }
}

suspend fun MutableList<Person>.addPassword(): Map<Person, Int> {
    return this.associateWith {
        println("Генерация пароля для ${it.name}")
        delay(500L)
        Random.nextInt(100000, 999999)
    }
}

suspend fun readDataPersonList() {
    resultList.forEach {
        println("Сотрудник: ${it.key}; пароль: ${it.value}")
        delay(1000L)
    }
}

class Person(val name: String, val salary: Int){
    override fun toString(): String {
        return "$name, зарплата: $salary"
    }
}
class PersonManager {
    fun addPerson(person: Person) {
        personList.add(person)
    }
}
