package functions_2

/**
 * 1. Написать функцию, на вход которой поступает массив из произвольного количества элементов.
 *  Данная функция проверяет, если в массиве локальные минимумы и возвращает число локальных минимумов.
 *  (локальный минимум – это когда два соседних элемента больше того, что между ними, например, 5,2,7).
 *
 * 2. Напишите функцию, в которой проверяется созданный Вами массив целых чисел.
 *  Если в нем имеются отрицательные элементы, то необходимо увеличить этот элемент на единицу и вернуть массив.
 */
fun main() {
    val array = arrayOf(21, 3, -2, 4, -1, 5, 7, 6, 1)
    println("Исходный массив: ${array.contentToString()}")
    println("Количество локальных минимумов =  ${localMin(array)}")
    println("Результат функции plusOne: ${plusOne(array).contentToString()}")
}

fun localMin(array: Array<Int>): Int {
    var countOfLocalMin = 0

    loop@ for (i in array.indices) {
        when {
            // если массив состоит из одного элемента, то этот элемент является локальным минимумом
            (array.size == 1) -> {
                countOfLocalMin++
            }

            // проверяем первый элемент
            (i == 0) -> {
                if (array[i] < array[i + 1]) {
                    countOfLocalMin++
                } else continue@loop
            }

            // проверяем последний элемент
            (i == array.size - 1 && array[i] < array[i - 1]) -> {
                countOfLocalMin++
            }

            (array[i] < array[i - 1] && array[i] < array[i + 1]) -> {
                countOfLocalMin++
            }
        }
    }
    return countOfLocalMin
}

fun plusOne(array: Array<Int>): Array<Int> {
    for (i in array.indices) {
        if (array[i] < 0) {
            array[i]++
        }
    }
    return array
}