package Interfaces_Task2_3

/**
 * 2. Даны целые положительные числа A и B.
 * Найти их наибольший общий делитель (НОД),
 * используя алгоритм Евклида: НОД(A,B) = НОД(B, A mod B), если B≠0; НОД(A, 0) = A.
 */

fun getNod(A: Int, B: Int): Int {
    return if (B == 0) A
    else {
        getNod(B, A % B)
    }
}
fun main() {
    val A = 7
    val B = 37
    var max = maxOf(A, B)
    var min = minOf(A, B)
    println("НОД = ${getNod(max, min)}")

}