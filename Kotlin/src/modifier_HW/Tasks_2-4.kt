package modifier_HW

/**
 * 2. Написать функцию поиска четных чисел двумерного массива размерностью 4 х 4.
 * 3. Написать функцию заполнения двумерного массива 4 х 4 числами от 1 до 16 включительно.
 * 4. Написать функцию вывода в консоль положительных элементов массива.
 *  Проверка на положительность числа выполняется локальной функцией внутри вышеуказанной.
 */
fun main() {
    println("\nЗадание 2")
    val matrix = MakeArray(4, 4, 1)
    matrix.print()
    matrix.getEven()

    println("\nЗадание 4")
    val matrix2 = MakeArray(4, 4, -8)
    matrix2.print()
    matrix2.getPositiveNumber()
}

class MakeArray(line: Int, column: Int, start: Int) {
    private val line = line //количество строк
    private val column = column // количество столбцов
    private val start = start // значение с которого будет происходить заполнение массива
    private var matrix = make()

    // функция заполнения двумерного массива числами от 1 до 16 включительно

    private fun make(): Array<Array<Int>> {
        var variable = start
        val matrix: Array<Array<Int>> = Array(line) { Array(column) { 0 } }
        for (i in matrix.indices) {
            for (j in matrix[i].indices) {
                matrix[i][j] = variable++
            }
        }
        return matrix
    }

    // вывод массива на экран
    fun print() {
        for (i in matrix.indices) {
            for (j in matrix[i].indices) {
                print("${matrix[i][j]} \t")
            }
            println()
        }

    }

    // функция поиска четных чисел двумерного массива
    fun getEven() {
        println("Четные числа: ")
        for (i in matrix.indices) {
            for (element in matrix[i]) {
                if (element % 2 == 0) {
                    print("$element \t")
                }
            }
        }
        println()
    }

    // функция вывода в консоль положительных элементов массива
    fun getPositiveNumber() {
        println("Положительные числа: ")
        // локальная функция проверки на положительность числа
        fun getPositve(number: Int): Boolean = (number > 0)
        for (i in matrix.indices) {
            for (j in matrix[i].indices) {
                if (getPositve(matrix[i][j])) {
                    print("${matrix[i][j]}\t")
                }
            }
        }
    }
}