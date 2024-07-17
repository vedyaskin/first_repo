package functions

/**
 * Написать функцию возведения числа a в степень n.
 */
fun main() {
    println(funDegree(9, 2))
}

fun funDegree(number: Int, degree: Int): Int {
    var result = 1
    for (i in 1..degree) {
        result *= number
    }
    return result
}