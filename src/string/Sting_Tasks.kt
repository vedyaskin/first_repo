package string

/**
 * 1. Дана строка «Занятие». Вывести на экран символы, составляющие данную строку.
 * 2. Нужно осуществить проверку номера телефона.
 *  Он должен начинаться с +7 и содержать 10 цифр, не считая +7.
 *  Если телефон верно введен, выведите true, иначе false.
 * 3. Дана строка. Вывести символы, составляющие эту строку, но в обратном порядке.
 * 4. Дана строка «kotlin2023course». Подсчитать количество содержащихся в ней цифр.
 */

fun main() {
    println("------------------- Задание 1 ---------------------")

    val stringOne = "Занятие"
    stringOne.forEach { element -> print(element) }
    println()

    println("------------------- Задание 2 ---------------------")

    val phoneNumber = "+79111234567"

    val funCheck: (str: String) -> Boolean = { str ->
        var checkNumber = true

        // проверяем префикс
        if (!str.startsWith("+7")) {
            println("Не верный префикс.")
            checkNumber = false

            // если префикс правильный, проверяем номер на длину
        } else if (str.substring(2).length != 10) {
            println("Непарвильное количество символов.")
            checkNumber = false
        }
        // проверяем номер на цифры
        else for (element in str.substring(2)) {

            // если не цифра, то false
            if (!element.isDigit()) {
                println("Номер должен содержать только цифры.")
                checkNumber = false
                break
            }
        }
        checkNumber
    }
    println(funCheck(phoneNumber))

    println("------------------- Задание 3 ---------------------")

    val stingTwo = "Дана строка. Вывести символы, составляющие эту строку, но в обратном порядке."
    println(stingTwo.reversed())

    println("------------------- Задание 4 ---------------------")
    val stringThree = "kotlin2023course"
    var countOfDigit = 0
    for (i in stringThree){
        if (i.isDigit()) countOfDigit++
    }
    println(stringThree)
    println("Количество цифр в строке: $countOfDigit")
}