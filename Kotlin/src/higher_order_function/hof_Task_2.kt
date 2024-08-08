package higher_order_function

/**
 * Написать функции изменения числа:
 *
 *  Одна – увеличение числа на единицу,
 *  вторая – умножение на два.
 *
 *  Написать функцию высшего порядка,
 *  которая на вход принимает массив целых чисел и
 *  вторым параметром функцию, принимающую число и возвращающая число.
 *  Функция высшего порядка будет возвращать измененный массив,
 *  который будет получаться за счет вызова внутри нее у этого массива функции map,
 *  внутри которой будет вызываться функция изменения числа.
 */
fun main(){
    val array = arrayOf(1,2,3,4,5)
    println("Исходный массив: ${array.contentToString()}")
    println("Увеличиваем на еденицу: ${ operation(array, ::plusOne) }")
    println("Умножаем на 2 ${operation(array, ::mult)}")
}

fun plusOne(a: Int): Int = a + 1
fun mult(a: Int): Int = a * 2
fun operation(array: Array<Int>, op: (Int) -> Int): List<Int> {
    val array2 = array.map { op(it) }
    return array2
}