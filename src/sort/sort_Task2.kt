package sort

/**
 * Дана матрица целых чисел размерностью 3х4.
 * Отсортировать ее строки по возрастанию
 */
fun main(){
    val matrix = listOf(
        listOf(4, 6, 1, 3),
        listOf(6, 7, 9, 0),
        listOf(3, 8, 12, 2)
    )
    var sortedMatrix  = matrix.map { it.sorted() }

    println("Исходный массив:")
    println(matrix.joinToString(separator = "\n") )

    println("Отсортированный массив:")
    println(sortedMatrix.joinToString(separator = "\n"))
}