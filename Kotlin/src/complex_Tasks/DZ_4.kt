package complex_Tasks

/**
 * Дано число n. Написать программу, которая проверяет, является ли оно простым.
 */
fun main() {
    val n = 19
    var compositeNumber = 0
    for (i in 2..<n) {
        if (n % i == 0) compositeNumber++
    }
    println(if (compositeNumber == 0) "$n простое число" else "$n составное число")
}