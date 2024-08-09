package higher_order_function

/**
 * Напишите анонимную функцию для объединения двух строк и возврата результата.
 */
fun main() {
    val string1 = "Привет"
    val string2 = "мир"
    val concat = fun(string1: String, string2: String) = string1 + string2
    println(concat(string1, string2))
}