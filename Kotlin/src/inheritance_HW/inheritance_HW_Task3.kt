package inheritance_HW

/**
 * Дан массив целых чисел 3, 67, 1, 55, 65, 89, 23.
 * Вывести на экран элементы массива, которые делятся на 5 на цело.
 */
fun main() {
    val array = arrayOf(3, 67, 1, 55, 65, 89, 23)
    println(array.contentToString())
    for (element in array) {
        if (element % 5 == 0) {
            print("$element ")
        }
    }
}
