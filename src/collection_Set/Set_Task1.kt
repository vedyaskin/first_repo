package collection_Set

import java.util.*

/**
 * 1. Разбить созданный набор на две коллекции,
 * чтобы в одной содержались четные элементы, в другой – нечетные.
 */

fun main() {
    val numbers = TreeSet<Int>()
    numbers.addAll(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    val numbersEven = LinkedHashSet<Int>()
    for (element in numbers) {
        if (element % 2 == 0) {
            numbersEven.add(element)
        }
    }
    numbers.removeIf { element -> element % 2 == 0 }
    println("Нечетные элементы: $numbers")
    println("Четные элементы: $numbersEven")
}