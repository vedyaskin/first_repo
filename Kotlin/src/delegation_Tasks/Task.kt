package delegation_Tasks

/**
 * 1. Написать программу перевода числа из десятичной системы в двоичную систему счисления.
 *
 * 2. Написать программу перевода числа из двоичной системы в десятичную систему счисления.
 */

fun main() {

    val digit = 10
    toBinary(digit)
    toDecimal("1010")
}


/** Функция перевода числа из двоичной системы в десятичную систему счисления.
 *  Алгоритм перевода числа из двоичной системы в десятичную:
 *
 *     Начните с крайней правой цифры двоичного числа.
 *     Умножьте каждую цифру на 2 в степени ее позиции (начиная с 0 для крайней правой цифры).
 *     Суммируйте все полученные произведения.
 *
 */
fun toDecimal(bin: String) {
    // bin - переменная, которая содержит двоичное число
    var base = 1 // Число, которое возводим в степень. Начинаем с 1 т.к 2^0 = 1
    var sum = 0

    // Начинаем с правой стороны, т.е. с последнего элемента массива
    for (i in bin.length - 1 downTo 0) {

        // Умножаем каждую цифру на 2 в степени ее позиции
        // И суммируем все полученные произведения
        sum += base * bin[i].digitToInt()
        base *= 2 // возводим в степень с помощью умножения
    }
    println("Десятичное число: $sum")
}


/** Функция перевода числа из десятичной системы в двоичную систему счисления.
 * Алгоритм для перевода десятичного числа в двоичное.
 *
 *     Разделите десятичное число на 2.
 *     Запишите остаток (0 или 1).
 *     Разделите результат деления снова на 2.
 *     Повторяйте шаги 2 и 3, пока результат деления не станет равным 0.
 *     Запишите все остатки в обратном порядке.
 *
 */
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