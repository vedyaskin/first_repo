package InfixFun

/**
 * Написать четыре инфиксных функции: сложения, вычитания, умножения и деления.
 * В функции main применить их для разных операндов, результат вывести в консоль.
 */

fun main() {
    val a = 3
    val b = 2

    println("$a + $b = ${a plus b}")
    println("$a - $b = ${a minus b}")
    println("$a / $b = ${a division b}")
    println("$a * $b = ${a multiplication b}")
}

// сложение
infix fun Int.plus(value: Int): Int {
    return this + value
}

//вычитание
infix fun Int.minus(value: Int): Int {
    return this - value
}

//деление
infix fun Int.division(value: Int): Int {
    return this / value
}

//умножение
infix fun Int.multiplication(value: Int): Int {
    return this * value
}