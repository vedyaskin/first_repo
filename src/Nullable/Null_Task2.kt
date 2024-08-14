package Nullable

/**
 * 2. Создайте функцию,
 *  которая возвращает сколько раз целое число может быть разделено
 *  на другое целое число без остатка.
 *  Функция должна возвращать null, если результатом деления является не целое число.
 *  Назовите функцию DivideIfWhole.
 *  Дополнительно написать решение,
 *  в случае, когда нет ни одного деления без остатка – вывести ноль.
 *  Рефакторинг сделать с применением оператора ?:
 */
fun DivideIfWhole(dividend: Int, divisor: Int): Int? {
    val result = dividend / divisor
    if (divisor == 0) {
        return null
    }
    return if (dividend % divisor != 0) {
        null
    }
    else {
        result
    }
}
fun DivideIfZero(dividend: Int, divisor: Int): Int {
    return DivideIfWhole(dividend, divisor) ?: 0
}

fun main() {
    println(DivideIfWhole(12, 7))
    println(DivideIfZero(12,7))

}
