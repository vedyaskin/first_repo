package coruotine_Channels

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlin.system.measureTimeMillis

/**
 *1.  Создайте класс Storage – это хранилище, в котором находится текстовая переменная text,
 * в ней хранится басня Крылова «Мартышка и очки».
 *
 * В классе с функцией main необходимо написать функцию, которая преобразует строку в список строк.
 * Написать функцию getList(text: String), которая отправляет данные этого списка в канал с задержкой 10L.
 *
 * В функции main необходимо получить эти данные и вернуть их в виде исходного текста,
 * сохранить результат в переменную stringResult.
 * Посчитать время, затраченное на получение данных в main.
 * Вывести в консоль полученный результат в stringResult.
 *
 * 2. Использовать тестовую переменную первой задачи.
 * Кроме функции getList(text: String) и getStringList(text: String),
 * необходимо написать функцию modifiedList, объединяющую каналы и отправляет данные в новый канал,
 * которые представляют следующий вид,
 * у каждого элемента списка берется первый элемент и переводится в верхний регистр.
 * В итоге результат объединения каналов со всеми преобразованиями в функции main
 * возвращается в строку stringResult.
 *
 * Кроме того, необходимо полученную строку разбить и поместить в список <String>.
 * Вывести в консоль полученный список, состоящий из первых символов каждого слова,
 * затраченное время на вышеуказанные операции.
 */

suspend fun main() {
    println("\n------------------- Задание 1 ---------------------\n")

    val text = Storage().text
    var stringResult = ""
    val time = measureTimeMillis {
        coroutineScope {
            val channel = getList(text)
            launch {
                for (lines in channel) {
                    stringResult += "$lines\n"
                }
            }
        }
    }
    println("\tМартышка и очки.\n$stringResult")
    println("Время, затраченное на получение данных: $time")

    println("\n------------------- Задание 2 ---------------------\n")
    stringResult = ""
    val timeTwo = measureTimeMillis {
        coroutineScope {
            val channelOne = getList(text)
            val channelTwo = modifiedList(channelOne)
            launch {
                for (letter in channelTwo) {
                    stringResult += "$letter "
                }

            }
        }
        joinAll()
        var listOfLetters: MutableList<String> = mutableListOf()
        stringResult.forEach { letter ->
            if (letter.toString() != " ") {
                listOfLetters.add(letter.toString())
            }
        }
        println("Список, состоящий из первых символов каждого слова:")
        println(listOfLetters)
    }
    println("Время, затраченное на получение данных: $timeTwo")

}

// Функция, которая преобразуют строку в список строк.
fun getStringList(text: String): List<String> = text.split("\n")

// Функция getList(text: String), которая отправляет данные этого списка в канал с задержкой 10L.
fun CoroutineScope.getList(text: String) = produce {
    val list = getStringList(text)
    for (lines in list) {
        delay(10L)
        channel.send(lines)
    }
    channel.close()
}

// Функция modifiedList, объединяющая каналы и отправляет данные в новый канал,
fun CoroutineScope.modifiedList(channel: ReceiveChannel<String>) = produce {
    channel.consumeEach {
        it.split(" ").forEach {// разбиваем строку на слова
            val letters = it.filter { it.isLetter() } // оставляем только буквы
            if (letters.isNotEmpty()) { // Проверяем, что после фильтрации элемент не пустой
                send(letters.first().uppercase()) // отправляем первую букву каждого слова в верхнем регистре
            }
        }
    }
}

class Storage {
    var text: String = """
        Мартышка к старости слаба глазами стала;
        А у людей она слыхала,
        Что это зло ещё не так большой руки:
        Лишь стоит завести Очки.
        Очков с полдюжины себе она достала;
        Вертит Очками так и сяк:
        То к темю их прижмёт, то их на хвост нанижет,
        То их понюхает, то их полижет;
        Очки не действуют никак.
        "Тьфу пропасть! – говорит она, –
        И тот дурак, кто слушает людских всех врак:
        Всё про Очки мне лишь налгали;
        А проку на волос нет в них".
        Мартышка тут с досады и с печали
        О камень так хватил их, что только брызги засверкали.
        К несчастью, тоже бывает у людей:
        Как ни полезна вещь, – цены не зная ей,
        Невежда про неё свой толк всё к худу клонит;
        А ежели невежда познатней,
        Так он её ещё и гонит.
    """.trimIndent()
}
