package NestedClasses_Task1

/**
 * 3. Создать массив целых чисел, в котором есть два нулевых элемента, не идущих подряд.
 * Посчитать количество элементов, которые находятся между нолями.
 */
fun main() {
    val array = arrayOf(1, 0, 5, 30, 4, 6, 8, 0, 10)
    val start = array.indexOf(0)
    val end = array.lastIndexOf(0)
    println("Количество элементов между нолями = ${end - start - 1}")

}