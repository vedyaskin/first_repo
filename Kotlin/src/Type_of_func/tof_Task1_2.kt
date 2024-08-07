package Type_of_func

/**
 * 1. Написать программу, которая будет вычислять факториал числа с применением рекурсии.
 *
 * 2. Написать функцию, которая находит N-ю степень числа 10 с применением рекурсии.
 *
 */

fun main() {
    var n = 5
    factorial(n)
    degree(n)
}

// находим факториал
fun factorial(n: Int) {
    var n = n
    var result = 1
    fun subFun(n: Int, result: Int) {
        var n = n
        var result = result
        if (n > 1) {
            result *= n--
            subFun(n, result)
        } else println(result)
    }
    subFun(n, result)
}

// возводим в степень
fun degree(n: Int) {
    var result = 1
    fun subFun(n: Int, result: Int) {
        var n = n
        var result = result
        if (n >= 1) {
            result *= 10
            subFun(--n, result)
        }
        else println(result)
    }
    subFun(n, result)
}