package Collection_aggregate

/**
 * 1. Дан список целых чисел. Необходимо найти сумму его элементов начиная с 3 заканчивая 9.
 *
 * 2. Дан список целых чисел.
 * С помощью функции fold вывести элементы этой коллекции в строку.
 * Т.е. входной список: val numbers = listOf(1, 2, 3, 4).
 * Выходные данные: 1234
 */

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Дан список целых чисел: ${numbers}")

    println("------------------------- Задание 1 -------------------------")
    val sumOfNumbers = numbers.foldIndexed(0) { id, sum, element ->
        if (id in 3..9) sum + element
        else sum
    }
    println("Сумма элементов начиная с 3 заканчивая 9: $sumOfNumbers")

    println("------------------------- Задание 2 -------------------------")
    val stringOfNumbers = numbers.fold("numbers = ") { str, element -> str + element }
    println(stringOfNumbers)
}