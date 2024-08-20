package Collection_Set

import java.util.*

/**
 * Дан набор целых чисел.
 * Необходимо создать новое множество
 * в который будут помещены элементы прежнего умноженные на два,
 * но с условием, что попадают в набор только элемент кратные пяти после умножения.
 */

fun main() {
    val numbers = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15)
    var numbersTwo = TreeSet<Int>()
    for (element in numbers) {
        if (((element * 2) % 5) == 0) {
            numbersTwo.add(element * 2)
        }
    }
    println(numbersTwo)
}