package coroutine_AAD

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
import kotlin.system.measureTimeMillis

/**
 * 1. Написать функции getRandomList() создания списков рандомных чисел и символов.
 * Данные функции могут быть перегруженными.
 *
 * Написать функцию распаковки списков unpack(), которые получаем из функций, описанных выше.
 * Она обобщенная, т.е. может принимать список разных типов.
 * Функция выводит в консоль элементы, но все через секундную задержку
 * и в процессе ведет подсчет количества элементов (для имитации длительной работы).
 * Возвращает количество элементов списка.
 *
 * Также есть функция, объединяющая списки в один concatenate().
 * Учитывайте, что списки могут быть разных типов.
 * Она возвращает объект Pair<Int, MutableList<T>>,
 * где Int – количество элементов объединенного списка,
 * MutableList<T> - сам список.
 *
 * В функции main:
 *
 * 1. Получить списки целых чисел и символов с помощью функций getRandomList(), состоящие из 10 элементов.
 * 2. Оба списка необходимо асинхронно распаковать.
 * 3. Вывести в консоль общий размер полученного списка.
 * 4. Объединить их функцией concatenate() и вывести в консоль полученный список.
 * 5. Посчитать общее время затраченных операций.
 */
suspend fun main() = runBlocking {
    val time = measureTimeMillis {
        val listOfInt = getRandomList(10, true)
        val listOfChar = getRandomList(10, false)

        val unpackInt = async { unpack(listOfInt) }
        val unpackChar = async { unpack(listOfChar) }

        println("Количество элементов: ${unpackInt.await() + unpackChar.await()}")
        println(concatenate(listOfInt,listOfChar))

    }
    println("Время затраченных операций: $time")
}

fun <T> concatenate(list1: MutableList<T>, list2: MutableList<T>): Pair<Int, MutableList<T>> {
    list1.addAll(list2)
    return list1.size to list1
}

suspend fun <T> unpack(list: List<T>): Int {
    var count = 0
    list.forEach {
        delay(1000L)
        println(it)
        count++
    }
    return count
}

fun getRandomList(size: Int, isInt: Boolean): MutableList<Any> {
    val list: MutableList<Any> = mutableListOf()
    if (isInt) {
        for (i in 1..size) {
            list.add(Random.nextInt(0, 1000))
        }
    } else {
        for (i in 1..size) {
            list.add(Random.nextInt(33, 127).toChar())
        }
    }
    return list
}