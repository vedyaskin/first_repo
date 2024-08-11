package Generics2_Home_Work

/**
 * 1. Создать обобщенный класс States,
 *  который содержит функцию getAverage(),
 *  возвращающую среднее значение массива чисел.
 *  Класс имеет ограничение,
 *  работать может только с числовыми значениями, T:Number.
 *
 *    1.2. Создать класс по имени GenericMethod и
 *       обобщенную функцию внутри класса по имени isItIncluded().
 *       Функция isItIncluded() определяет, является ли объект членом массива.
 *       Он может быть использован с любым типом объектов и массивов до тех пор,
 *       пока массив содержит объекты, совместимые с типом искомого объекта.
 */
fun main() {
    val array = States(
        arrayOf(1, 2, 3, 4, 5, 6, 7)
    )
    println("Среднее значение: ${array.getAverage()}")


    val arrayString = GenericMethod(arrayOf("банан", "арбуз", "киви", "слива"))

    val print: (Boolean) -> Unit = { check ->
        if (check) println("Такой элемент есть")
        else println("Такого элемента нет.")
    }

    print(arrayString.isItIncluded("киви"))

    val arrayInt = GenericMethod(array.array)
    print(arrayInt.isItIncluded(1))

}

class GenericMethod<T>(val array: Array<T>) where T : Comparable<T> {

    fun isItIncluded(element: T): Boolean {

        return array.contains(element)
    }
}

open class States<T>(val array: Array<T>) where T : Number {
    fun getAverage(): Double {
        val sum = array.sumOf { it.toDouble() }
        return sum / array.size
    }
}