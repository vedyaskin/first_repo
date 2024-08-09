package Anonym_Func

/**
 * Создать массив целых чисел произвольного размера.
 * Написать анонимную функцию isEven,
 * проверяющую число на четность,
 * она возвращает логический тип.
 * Написать функцию checkArrayElement проверки массива и его элементов на четность,
 * она на вход принимает массив и вторым параметром анонимную функцию типа isEven.
 */
fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    var isEven = fun(a: Int): Boolean = (a % 2 == 0)
    //println(isEven(4))
    fun checkArrayElement(array: Array<Int>, op: (Int) -> Boolean): Array<Int>{
        return array.filter{op(it)}.toTypedArray()
    }
    println(checkArrayElement(array, isEven).contentToString())
}