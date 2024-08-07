package complex_Tasks

/**
 * Есть загадка: "Что это такое: синий, большой, с усами и полностью набит зайцами?"
 * Ответ: троллейбус. Представим, что Вы загадываете эту загадку пользователю.
 * Создайте программу, которая будет считывать с консоли ответ.
 *
 *  Условия задачи:
 *
 *     У пользователя есть 3 попытки. После трех ответов программа должна завершиться;
 *     Если пользователь вводит "Троллейбус", мы выводим в консоль "Правильно!" и выходим из цикла;
 *     Если пользователь вводит "Сдаюсь", мы выводим в консоль "Правильный ответ: троллейбус." и выходим из цикла;
 *     Если пользователь вводит любой другой ответ, мы выводим в консоль "Подумай еще." и продолжаем цикл.
 */
fun main() {
    println("Загадка: \"Что это такое: синий, большой, с усами и полностью набит зайцами?\" ")
    loop@ for (i in 1..3) {
        val input = readln().toString().lowercase()
        when (input) {
            "троллейбус" -> {
                println("Правильно!")
                break@loop
            }

            "сдаюсь" -> {
                println("Правильный ответ: троллейбус.")
                break@loop
            }

            else -> {
                if (i == 3) break@loop
                println("Подумай еще.")
            }
        }
    }
}