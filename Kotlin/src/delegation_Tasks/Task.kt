package delegation_Tasks

/**
 * 1. Написать программу перевода числа из десятичной системы в двоичную систему счисления.
 *
 * 2. Написать программу перевода числа из двоичной системы в десятичную систему счисления.
 */

fun main() {

    val digit = 10
    toBinary(digit)
    toDecimal(toBinary(digit))
}

fun toDecimal(bin: String) {
    var base = 1
    var sum = 0

    for (i in bin.length - 1 downTo 0) {
        sum += base * bin[i].digitToInt()
        base *= 2
    }
    println("Десятичное число: $sum")
}

fun toBinary(a: Int): String {
    var string = "" // сюда заносим остатки от деления
    var reminder = a // остаток от деления
    var devision = a// результат деления

    while (devision != 0) {
        reminder = devision % 2
        devision /= 2
        string += "$reminder"
    }
    println("Двоичное число: ${string.reversed()}")
    return string.reversed()

}