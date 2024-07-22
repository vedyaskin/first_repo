package incapsulation_HW

/**
 * Написать класс «Банковская карта».
 * В нем создать свойства номера карты и код карты.
 * В главной функции мы можем получить доступ к номеру карты, но не можем к коду.
 * Есть функция, которая описывает, что данные карты будут доступны после ввода пароля.
 */
fun main() {
    val card = Bank_Card()

    // вводим номер карты
    card.cardNumber = "1234567891234567"
    println("Номер карты: ${card.cardNumber}")

    // вводим CVC код
    card.cvcSet(123)
    card.getCvc()
}

class Bank_Card {
    val passwordForCvc = "12345" // пароль для доступа к cvc коду

    var cardNumber: String = ""
        // сеттер для номера карты
        set(value) {
            if (value.length == 16) {
                field = value
            } else {
                println("Введен не правильный номер карты")
                field = "Error"
            }
        }
        get() = field

    private var cvc: Int = 0
        // сеттер для cvc

        set(value) {
            // Проверка на трехзначность т.к. cvc состоит из 3-х цифр

            if (value in 100..999) {
                field = value
            } else {
                println("Введен не правильный CVC код")
                field = 0
            }
        }
        get() {
            // если поле CVC введено верно, то для его просмотра
            // запрашиваем пароль и проверяем его правильность
            if ( field != 0 ) {
                var count = 3 // количество попыток ввода пароля
                var check: Boolean = false // указывает правильно ли введен пароль или нет

                while (count-- > 0) {
                    println("Для просмотра cvc кода введите пароль")
                    // читаем с клавиатуры и проверяем правильность пароля,
                        var pswd = readln()
                        if (pswd.equals(passwordForCvc) ) {
                            check = true
                            break
                        } else {
                            println("Пароль неверный, попробуйте еще раз:")
                            println("Осталось попыток $count")
                        }
                }
                return if (check) {
                    field  // Возврат значения CVC кода
                } else 0  // возвращаем 0 если пароль введен не верно
            } else return field
        }
    // функция для внесения значения в переменную cvc
    fun cvcSet(c: Int) {
        cvc = c
    }
    // функция вывода на экран кода cvc
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