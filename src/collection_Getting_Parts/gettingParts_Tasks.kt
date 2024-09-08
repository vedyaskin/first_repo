package collection_Getting_Parts

/**
 * 1. Дан список целых чисел от 1 до 20 включительно.
 * Посчитать количество четных чисел списка, начиная с 5 элемента до конца списка.
 * Целесообразно использовать функции drop(), count().
 *
 * 2. Дан список целых чисел от 1 до 20 включительно.
 * Посчитать сумму первых 7 чисел списка,
 * Целесообразно использовать функции take(), sum().
 *
 * 3. Дан список строк: {"one", "two", "three"}.
 * Необходимо получить и вывести в консоль список вида:  [o, n, e, t, w, o, t, h, r, e, e].
 * Целесообразно использовать функции map(), flattaen().
 *
 * 4. Дан список строк.
 * Найти строку максимальной длины.
 * Целесообразно использовать агрегатные операции.
 *
 * 5. Написать класс Product с полями название и количество в конструкторе.
 * Создать список продуктов, состоящий из нескольких объектов класса.
 * Посчитать общее количество продуктов, имеющихся на складе (в списке).
 * Целесообразно использовать функции map(), fold().
 */

fun main() {
    val numbers = (1..20).toList()
    println("\n-------------- Задание 1 --------------------\n")
    val enumNumbers = numbers.drop(5).count { it % 2 == 0 }
    println("Исходный список: $numbers")
    println("Количество четных элементов, начиная с 5-го: $enumNumbers")

    println("\n-------------- Задание 2 --------------------\n")
    val multip = numbers.take(7).sum()
    println("Исходный список: $numbers")
    println("Сумма первых 7 элементов: $multip")

    println("\n-------------- Задание 3 --------------------\n")
    val strings = listOf("one", "two", "three")
    val wordsOfStrings = strings.map { it.map { it } }.flatten()
    println("Исходный список: $strings")
    println("Результат: $wordsOfStrings")

    println("\n-------------- Задание 4 --------------------\n")
    val maxString = strings.maxBy { it.length }
    println("Исходный список: $strings")
    println("Строка максимальной длины: $maxString")

    println("\n-------------- Задание 5 --------------------\n")
    val products = listOf(
        Product("Авокадо", 25),
        Product("Абрикос", 10),
        Product("Черешня", 5),
        Product("Виноград", 15),
        Product("Мандарин", 20),
    )
    val sumOfQuantity = products.map { it.quantity }.fold(0) { a, b -> a + b }
    products.map { it.printInfo() }
    println("Итого:\t $sumOfQuantity")
}

class Product(val name: String, val quantity: Int) {
    fun printInfo() {
        println("$name:\tкол-во: $quantity")
    }
}