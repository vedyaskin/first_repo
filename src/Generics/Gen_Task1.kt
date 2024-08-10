package Generics

/**
 * Написать функцию print(), которая на вход может принимать различные типы.
 * Вызвать эту функцию несколько раз, поместив аргументы разных типов.
 */
fun main() {
    print(899)
    print("Всем привет!")
    print(arrayOf(1,2,3,4,5).contentToString())
}

fun <T> print(value: T) {
    println(value)
}