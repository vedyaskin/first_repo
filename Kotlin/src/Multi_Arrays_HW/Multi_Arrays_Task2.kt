package Multi_Arrays_HW

/**
 * Создать матрицу размером 3 х 5. Найти элемент в этом массиве, который является средним(медиана).
 */
fun main() {
    val matrix = arrayOf(
        arrayOf(4, 6, 1, 13, 5),
        arrayOf(10, 7, 9, 14, 8),
        arrayOf(3, 11, 12, 2, 15)
    )
    // создаем одномерный массив, в который будем вносить элементы из
    // двумерного массива
    var array = Array(matrix.size * matrix[0].size) { 0 }
    var count = 0
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            array[count++] = matrix[i][j]
        }
    }
    // сортируем
    val array_sorted = array.sortedArray()
    println(array_sorted.contentToString())
    // т.к массив состоит из не четного количества элементов
    // то медиана будет равна значению стоящему в середине массива
    var medianaIndex = array_sorted.size / 2 // вычисляем индекс медианы
    println("Медиана = ${ array_sorted[medianaIndex] }") // выводим элемент с индексом medianaIndex

}