package collection_Map

/**
 * Напишите функцию, которая получает на вход массив элементов типа К (Generic)
 * и возвращает Map<K, Int>,
 * где K — значение из массива,
 * а Int — количество вхождений в массив.
 * Т.е. массив val array = arrayOf(2, 4, 7, 1, 2, 4).
 * Выходные данные: {1=1, 2=2, 4=2, 7=1}.
 */
fun main() {
    val array = arrayOf(2, 4, 7, 1, 2, 4)
    println(countFun(array.sortedArray()))
}

// функция подсчитывающая количество вхождений
fun <K> Array<K>.getNumberOfOccurences(element: K): Int {
    var count = 0
    for (i in this) {
        if (i == element) count++
    }
    return count
}

// функция, которая получает на вход массив элементов типа К (Generic)
fun <K> countFun(array: Array<K>): Map<K, Int> {
    var map: MutableMap<K, Int> = linkedMapOf()
    for (i in array) {
        map.put(i, array.getNumberOfOccurences(i))
    }
    return map
}