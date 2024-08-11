package Exception

class Catalog() : Person() {
    var persons: Array<Person>

    init {
        persons = Array<Person>(10) { Person() }
    }

    fun printCatalog() {
        var isEmpty = true
        for (i in persons.indices) {
            if (persons[i].name != "") {
                println("№ $i Имя: ${persons[i].name} Фамилия: ${persons[i].surname}")
                isEmpty = false
            }
        }

        if (isEmpty) println("Каталог пуст.")
    }

    fun printEmpyPosition() {
        print("Свободные позиции: ")
        for (i in persons.indices) {
            if (persons[i].name == "") {
                print("$i ")
            }
        }
        println()
    }

    fun inputData(): Array<String> {
        val dataOfPerson = Array<String>(2) { "" }

        main@ while (true) {
            while (dataOfPerson[0] == "") {
                try {
                    print("Введите имя: ")
                    var input = readln()
                    if (!input.isEmpty()) {
                        dataOfPerson[0] = input
                    } else {
                        throw MyException("Имя не может быть пустым.")
                    }
                } catch (e: MyException) {
                    println("Ошибка! ${e.message}")
                }
            }
            while (dataOfPerson[1] == "") {
                try {
                    print("Введите фамилию: ")
                    var input = readln()
                    if (!input.isEmpty()) {
                        dataOfPerson[1] = input
                    } else {
                        throw MyException("Введена пустая строка.")
                    }
                } catch (e: MyException) {
                    println("Ошибка! ${e.message}")
                }
            }
            break@main
        }
        return dataOfPerson
    }

    fun createList(list: Array<String>) {
        while (true) {
            try {
                printEmpyPosition()
                print("Введите номер позиции: ")
                val number = readln().toInt()
                if (persons[number].name == "") {
                    persons[number].name = list[0]
                    persons[number].surname = list[1]
                    break
                } else {
                    throw MyException("Позиция $number занята.")
                }

            } catch (e: ArrayIndexOutOfBoundsException) {
                println("Ошибка! Позиция может быть от 0 до 9")
            } catch (e: NumberFormatException) {
                println("Введите цифру от 0 до 9")
            } catch (e: MyException) {
                printEmpyPosition()
                println(e.message)
            }
        }
    }

    fun greeting() {
        menu@ while (true) {
            println("Сделайте выбор:")
            println("1. Посмотреть содержимое каталога.")
            println("2. Добавить в каталог.")
            println("3. Посмотреть свободные позиции в каталоге.")
            println("4. Выйти из программы.")

            try {
                var input = readln().toInt()
                when (input) {
                    1 -> printCatalog()
                    2 -> createList(inputData())
                    3 -> printEmpyPosition()
                    4 -> break@menu
                    else -> throw MyException("Ошибка выбора.")
                }
            } catch (e: MyException) {
                println(e.message)
            } catch (e: NumberFormatException){
                println("Неправильный ввод.")
            }
        }
    }
}