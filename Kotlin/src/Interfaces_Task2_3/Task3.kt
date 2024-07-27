package Interfaces_Task2_3

/**
 * 3. Дан набор целых чисел. Найти второе максимальное число.
 *
 */
fun main() {
    val array = arrayOf(1, 12, 3, 14, 0, 6, 7, 8, 2, 10)
//    array.sortDescending()
//    println("второе максимальное число = ${array[1]}")

    var max1 = 0 // первое максимальное число
    var max2 = 0 // второе максимальное число

    for (i in array.indices) {
        if (max1 < array[i]) {
            max2 = max1
            max1 = array[i]
        } else if (max2 < array[i] && array[i] < max1) {
            max2 = array[i]
        }

    }

    println("первое максимальное число = $max1\n" +
            "второе максимальное число = $max2")
}