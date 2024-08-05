package Anonym_Class

/**
 * 	Посчитать сумму элементов побочной диагонали матрицы 4х4.
 */
fun main() {
    val matrix = arrayOf(
        arrayOf(4, 6, 1, 3),
        arrayOf(5, 7, 9, 0),
        arrayOf(8, 2, 11, 10),
        arrayOf(13, 14, 15, 12)
    )
    var sum = 0
    var j = 0
    for (i in matrix.size-1 downTo 0) {
        sum += matrix[i][j++]
    }
    println("sum = $sum")
}