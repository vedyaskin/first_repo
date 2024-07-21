package incapsulation_HW

/**
 * Написать класс «Банковская карта».
 * В нем создать свойства номера карты и код карты.
 * В главной функции мы можем получить доступ к номеру карты, но не можем к коду.
 * Есть функция, которая описывает, что данные карты будут доступны после ввода пароля.
 */
fun main() {
    val card = Bank_Card()
    // вводим данные
    card.cardNumber = "1234567891234567"
    card.cvcSet(123)
    // выводим на экран
    println("Номер карты: ${card.cardNumber}")
    card.getCvc()
}

class Bank_Card {
    val passwordForCvc = 12345 // пароль для доступа к cvc

    var cardNumber: String = ""
        set(value) {
            if (value.length == 16) {
                field = value
            } else {
                println("Введен не правильный номер")
                field = "Error"
            }
        }
        get() = field

    private var cvc: Int = 0
        set(value) {

            // Проверка на трехзначность т.к. cvc состоит из 3-х цифр

            if (value in 100..999) {
                field = value
            } else {
                println("Введен не правильный код")
                field = 0
            }
        }
        get() {
            var count = 3
            var check: Boolean = false
            while (count-- > 0) {
                println("Для просмотра cvc кода введите пароль")
                // используем исключение как на java
                try {
                    var pswd = readln().toInt()
                    if (pswd == passwordForCvc) {
                        check = true
                        break
                    }
                } catch (e: NumberFormatException) {
                    println("Пароль неверный, попробуйте еще раз:")
                    println("Осталось попыток $count")
                }
            }
            return if (check) {
                field  // Возврат значения CVC кода
            } else 0  // возвращаем 0 если пароль введен не верно
        }

    fun cvcSet(c: Int) {
        cvc = c
    }

    fun getCvc() {
        // вводим переменную cvcValue для вывода на экран значения cvc
        // иначе постоянно будет запускаться цикл проверки пароля
        val cvcValue = cvc
        if (cvcValue == 0) {
            println("Доступ запрещен")
        } else {
            println("Код cvc: $cvcValue")
        }
    }
}