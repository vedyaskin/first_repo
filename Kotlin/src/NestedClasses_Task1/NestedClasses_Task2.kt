package NestedClasses_Task1

/**
 * 2. Дан строковый массив "Иванов", "Петров", "Сидоров", "Процветов", "Протасов".
 * Написать программу поиска и вывода на экран элементов массива по вводимым символам.
 */
fun main() {
    val array = arrayOf("Иванов", "Петров", "Сидоров", "Процветов", "Протасов")
    search("проц", array)
}

// функция для поиска
fun search(symbols: String, array: Array<String>) {

    val symbols = symbols // содержит символы по которым будем искать

    for (elementOfArray in array) {
        var count = 0 // счетчик совпадения элементов
        for (i in 0..< symbols.length) {
            if (symbols[i].equals(elementOfArray[i], ignoreCase = true)) {
                count++
            } else break
        }
        if (count == symbols.length) println(elementOfArray)
    }
//  var subSring = "" // подстрока элемента массива
// извлекаем подстроку размером symbols.length из элемента массива
// subSring = elementOfArray.substring(0, symbols.length);
//        if (symbols.equals(subSring, ignoreCase = true)) {
//            println(elementOfArray)
//        }
}

