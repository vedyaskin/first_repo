package Generics

/**
 * 3. Написать функцию вывода в консоль переменных разных типов данных.
 *  Вторым параметром в функции будет тип Char и будет представлять то,
 *  во что будет оборачиваться переменная параметризованного типа,
 *  поступающая на вход в качестве первого параметра.
 *  Например, переменная Int должна оборачиваться в фигурные скобки.
 *  Пример ввода данных и полученного результата должен быть таким:
 *
 * val a: Int = 10 -> {10}
 * val b: String = "Hello" -> [Hello]
 * val c: List<Int> = listOf(10, 16, 3) -> "[10, 16, 3]"
 * val d = 'f' -> (f)
 *
 */

fun main() {
    val a: Int = 10
    val b: String = "Hello"
    val c: List<Int> = listOf(10, 16, 3)
    val d = 'f'

    print(a, '{')
    print(b, '[')
    print(c, '"')
    print(d, ')')
}

fun <T> print(value: T, char: Char) {
    when(char){
        '[', ']' -> println("[$value]")
        '{', '}' -> println("{$value}")
        '"' -> println("\"$value\"")
        '(', ')' -> println("($value)")
        else -> println(value)
    }
}