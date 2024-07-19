package functions_2
/**
 * Дана матрица размера M×N и целое число K (1≤K≤M).
 * Вывести элементы K-й строки данной матрицы.
 *
 */
import kotlin.random.Random
fun main() {
    val M = 5 // количество строк
    val N = 5 // количество столбцов
    val K = 4 // строка

    var matrix = makeMatrix(M, N)
    printMatrix(matrix)
    println()
    println(printK(matrix, K, M))

}
// создание матрицы
fun makeMatrix(M : Int, N : Int) : Array<Array<Int>>{
    val matrix = Array(M) { Array(N) { 0 } }
    println("Исходная матрица: ")
    // заполняем массив элементами
    for ( i in matrix.indices ){
        for(j in matrix[i].indices){
            matrix[i][j] = Random.nextInt(20)
        }
    }
    return matrix
}
//вывод матрицы на экран
fun printMatrix(matrix : Array<Array<Int>>) {
    for ( i in matrix.indices ){
        for (j in matrix[i].indices ){
            print("${matrix[i][j]} ")
        }
        println()
    }
}
// вывод строки К
fun printK(matrix : Array<Array<Int>>, K : Int, M : Int) : String {
    println("K = $K")
    if ( 1<=K && K<=M){
        return "Строка $K : ${matrix[K-1].contentToString()}"
    } else return "Ошибка. 'К' должен быть  (1≤K≤M)"

}

