package suspend

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch

/**
 * 1. Написать класс Person с полями в конструкторе name и age, класс.
 * Создать список persons, в который включить несколько объектов этого класса.
 * Написать класс Weather с полями city, description, temp,
 *  создать список из нескольких объектов этого класса.
 * Создать список случайных чисел в диапазоне от 1 до 100 из 10 элементов.
 *
 *
 * Представим, что эти три списка мы планируем загрузить с сервера.
 *
 * Необходимо написать обобщенную suspend – функцию,
 * принимающую на вход список параметра T
 * и в результат возвращающую скачанный этот же список.
 *
 * Она будет имитировать скачивание данных.
 * Внутри функции с задержкой в 1000L выводить скачанные данные.
 * В главной функции нужно вызвать функции загрузки трех имеющихся списков:
 * personList, weatherList, randoms.
 * Мы будем наблюдать, как идет процесс загрузки (элементы в функции выводятся).
 * Главный поток при их загрузке останавливается.
 * Когда загрузка заканчивается в консоль выходит фраза «Данные загружены» и выводятся все три списка.
 * В завершении выходит фраза «Программа завершена».
 */

suspend fun main() = coroutineScope {
    val randoms = listOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    val personList = listOf(
        Person("Иван", 34),
        Person("Мария", 24),
        Person("Сергей", 18),
    )
    val weatherList = listOf(
        Weather("Москва", "ясно", 20),
        Weather("Санкт-Петербург", "облачно", 18),
        Weather("Сочи", "Ясно", 28),
    )
    val results = mutableListOf<List<Any>>()

    val task = listOf(
        launch {
            results.add(downloadData(randoms))
        },
        launch {
            results.add(downloadData(personList))
        },
        launch {
            results.add(downloadData(weatherList))
        }
    )
    task.joinAll()
    println("Данные загружены: ")
    results.forEach { it.forEach { println(it) }}
    println("Программа завершена.")

}

private suspend fun <T> downloadData(value: List<T>): List<T> {
    for (i in 0..value.lastIndex) {
        delay(1000L)
        println(value[i])
    }
    return value
}

data class Person(val name: String, val age: Int)
data class Weather(val city: String, val description: String, val temp: Int)