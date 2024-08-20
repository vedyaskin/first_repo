package Collection_Set

/**
 * 	Дан массив целых чисел.
 * 	Нужно переместить все нули в конец массива,
 * 	сохранив порядок остальных элементов.
 * 	Т.е. исходный массив 0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0
 * 	Результат: 6, 2, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0
 */
fun main() {
    var array = arrayOf(0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0)
    val arrayNoZero = array.filter{ it != 0}
    val arrayWithZero = array.filter{ it == 0}
    array = (arrayNoZero + arrayWithZero).toTypedArray()

    println(array.contentToString())
}