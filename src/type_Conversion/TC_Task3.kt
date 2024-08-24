package type_Conversion

/**
 *  Написать функцию, которая на вход принимает типизированный параметр.
 *  Если это будет целое число,
 *  то в консоль вывести сумму вводимого числа и единицы,
 *  если строка - сумму длины строки и единицы,
 *  если массив целых чисел - сумму элементов массива.
 */

fun <T> plusOneOrSum(value: T) {
    when (value) {
         is Int -> println(value + 1)
         is String -> println(value.length + 1)
         is Array<*> -> {
             if (value.isArrayOf<Int>()) {
                 println((value as Array<Int>).sum())
             }
         }
    }
}
fun main(){
    plusOneOrSum(2)
    plusOneOrSum("дом")
    plusOneOrSum(arrayOf(1,2,3))
}