package type_Conversion

/**
 * Написать функцию, которая проверяет чем,
 * является вводимый аргумент строкой,
 * числом,
 * числом с плавающей точкой,
 * символом.
 * Ввод должен быть таким: «Это строка».
 */

fun <T> checkArg(value: T) {
    when (value) {
        is String -> println("Это строка.")
        is Int -> println("Это число.")
        is Double -> println("Это число с плавающей точкой.")
        is Char -> println("Это символ.")
    }
}

fun main() {
    checkArg("13")
    checkArg(13)
    checkArg(1.5)
    checkArg('1')
}