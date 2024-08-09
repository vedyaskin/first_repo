package Lambda

/**
 * 3. Дан массив произвольного набора чисел.
 * Отфильтруйте его, чтобы в нем остались только положительные числа.
 */

fun main() {
    val array = arrayOf(-1, 2, -4, 6, -10, 7, 8, 6)
    val arrayPositive: (Array<Int>) -> Array<Int> = { array ->
        array.filter { it > 0 }.toTypedArray()
    }
    println("Исходный список:  ${array.contentToString()}")
    println("Отфильтрованный список: ${arrayPositive(array).contentToString()}")
}