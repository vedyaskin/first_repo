package Multi_Arrays_HW

/**
 * Найти минимальный элемент в целочисленном массиве размера 3 х 3.
 */
fun main() {
    val matrix = arrayOf(
        arrayOf(4, 6, 10, 3),
        arrayOf(10, 7, 9, 10),
        arrayOf(3, 8, 12, 2)
    )
    var count = 0
    var min = matrix[0][0]

    for (row in matrix) { // идем по строкам
        for (element in row) { // идем по столбцам
            if (element < min) {
                min = element
            }
            count++
        }
    }
    println("min = $min")
}