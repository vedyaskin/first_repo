package checkAndGroup

/**
 * 1. Дан список слов в произвольном порядке по алфавиту.
 * Необходимо сгруппировать элементы по первому символу.
 *
 * 2. Дан список строк. Необходимо сгруппировать его по длине строки.
 */

fun main() {
    val words = listOf(
        "Виноград",
        "Ананас",
        "Ваниль",
        "Грейпфрут",
        "Вишня",
        "Абрикос",
        "Гранат",
        "Арбуз",
        "Груша"
    )
    println("----------------- Задание 1 ----------------------")
    // Группируем по первому символу.
    val groupBySymbol = words.groupBy { it[0] }.toSortedMap()
    println("Исходный список: $words")
    println("Сгруппированный список:")
    for (element in groupBySymbol){
        println(element.key)
        for (word in element.value){
            println(word)
        }
    }
    println("----------------- Задание 2 ----------------------")
    // Группируем по длине строки.
    val groupByLength = words.groupBy { it.length }.toSortedMap()
    println("Исходный список: $words")
    println("Сгруппированный список:")
    for (element in groupByLength){
        println()
        println("Количество символов: ${element.key}")
        for (word in element.value){
            println(word)
        }
    }

}