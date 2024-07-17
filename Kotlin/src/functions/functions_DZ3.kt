package functions

/**
 * Написать функцию, которая принимает два целых числа a и b.
 * Результатом работы функции должен быть вычисленный наибольший общий делитель a и b.
 *
 * Для нахождения наибольшего общего делителя двух чисел нужно:
 * 1. заменить большее из чисел на остаток от деления его на меньшее и
 * 2. для полученной пары повторять эту процедуру, пока одно из чисел не станет равно нулю.
 * Тогда второе число будет равно наибольшему общему делителю исходных чисел.
 */
fun main() {
    println(greatestCommonDivisor(140, 96))
}

fun greatestCommonDivisor(a: Int, b: Int): Int {
    var result = 1
    var max = maxOf(a, b)
    var min = minOf(a, b)
    var temp = 0
    if (max % min == 0) {
        result = min
    } else {
       loop@while (max != 0 || min != 0) {
            max %= min
            temp = min
            min = max
            max =  temp
            if ( max == 0 ) {
                result = min
                break@loop
            }
            else if ( min == 0 ) {
                result = max
                break@loop
            }
        }
    }
    return result
}