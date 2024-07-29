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
    var subSring = "" // подстрока элемента массива

    for (elementOfArray in array) {

        // извлекаем подстроку размером symbols.length из элемента массива
        subSring = elementOfArray.substring(0, symbols.length);

        if (symbols.equals(subSring, ignoreCase = true)) {
            println(elementOfArray)
        }
    }
}

