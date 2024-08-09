package Lambda

/**
 * 1. Напишите функцию, которая запускает лямбду print()
 * столько раз сколько будет указано в параметре count.
 * Например, чтобы передаваемое сообщение в print() выводилось count раз.
 */

fun main() {
    val print = { println("Привет мир!") }
    fun funPrint(count: Int) {
        if (count >= 1) {
            print()
            funPrint(count - 1)
        } else {
            return
        }
    }
    funPrint(5)
}