package Lambda

/**
 * 2. Напишите программу,
 * реализующую лямбда-выражение для вычисления
 * среднего арифметического списка чисел.
 */
fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val arithmeticMean: (Array<Int>) -> Int = { array ->
        val sum = array.reduce {sum, element -> sum + element}
        sum/array.size
    }
    println(arithmeticMean(array))

}