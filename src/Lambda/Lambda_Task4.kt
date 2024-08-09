package Lambda

/**
 * 4. Напишите программу, которая реализует
 * лямбда-выражение для работы с массивом целых чисел таким образом,
 * что его четные элементы делятся на 2,
 * нечетные – умножаются на 3.
 */

fun main(){
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val lambda: (Array<Int>) -> Array<Int> = {
        array.map{
            if (it % 2 == 0) {
                it / 2
            } else{
                it * 3
            }
        }.toTypedArray()
    }
    println("Исходный массив: ${array.contentToString()}")
    println("Преобразованный массив: ${lambda(array).contentToString()}")
}