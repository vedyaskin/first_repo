package Arrays_HW

/**
 * Дано целое число N(>0). Сформировать и вывести целочисленный массив размера N,
 * содержащий степени двойки от первой до N-й: 2,4,8,16,….
 */
fun main() {
    val N = 10
    var base = 1
    val array = Array(N) { 0 }
    // цикл для записи в массив
    for (i in 0..<N) {
        base *= 2
        array[i] = base
    }
    println(array.contentToString())
}