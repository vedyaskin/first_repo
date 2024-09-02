package sort

/**
 * Дана матрица целых чисел размерностью 3х4.
 * Проверить, являются ли внутренние массивы матрицы пилообразными,
 * т.е. рядом с элементом массива находятся соседи большие или меньшие его.
 * Необходимо вывести количество пилообразных массивов и сами массивы.
 */
fun main() {
    val matrix = arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(5, 6, 4, 7),
        arrayOf(0, 5, 2, 8),
    )
    var sawtoothList: MutableList<Array<Int>> = mutableListOf()

    // Проверить, являются ли внутренние массивы матрицы пилообразными
    for (i in 0..matrix.lastIndex) {
        for (j in 1 until matrix[i].lastIndex) {
            if ((matrix[i][j] < matrix[i][j - 1] && matrix[i][j] < matrix[i][j + 1]) || (matrix[i][j] > matrix[i][j - 1] && matrix[i][j] > matrix[i][j + 1])) {
                sawtoothList.add(matrix[i])
            }
        }
    }

    println("Количество пилообразных массивов: ${sawtoothList.distinct().size}")
    sawtoothList.distinct().forEach { println(it.contentToString()) }

}