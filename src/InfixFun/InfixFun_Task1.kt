package InfixFun

/**
 * Написать четыре инфиксных функции: сложения, вычитания, умножения и деления.
 * В функции main применить их для разных операндов, результат вывести в консоль.
 */

fun main() {
    val a = 3
    val b = 2

    println("$a + $b = ${a add b}")
    println("$a - $b = ${a subtract b}")
    println("$a / $b = ${a divide b}")
    println("$a * $b = ${a multiply b}")
}

// сложение
private infix fun Int.add(value: Int): Int {
    return this + value
}

//вычитание
private infix fun Int.subtract(value: Int): Int {
    return this - value
}

//деление
private infix fun Int.divide(value: Int): Int {
    return this / value
}

//умножение
private infix fun Int.multiply(value: Int): Int {
    return this * value
}