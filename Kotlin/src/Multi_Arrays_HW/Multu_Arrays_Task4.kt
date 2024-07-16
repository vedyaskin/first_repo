package Multi_Arrays_HW

/**
 * Дан набор целых чисел. Найти второе максимальное число.
 */
fun main() {
    val matrix = arrayOf(
        arrayOf(2, 6, 1, 3),
        arrayOf(4, 7, 19, 0),
        arrayOf(5, 8, 12, 2)
    )
    // создаем массив для всех максимальных значений строк
    var arrayOfMax = Array( matrix.size ) {0}

    // в цикле сортируем каждую строку по убыванию
    for (i in matrix.indices) {
        matrix[i].sortDescending()

        // заносим все максимальные значения в массив
        arrayOfMax[i] = matrix[i][0]
    }
    // сортируем этот массив по убыванию
    arrayOfMax.sortDescending()

    println("Второе максимально значение = ${arrayOfMax[1]} ")


}