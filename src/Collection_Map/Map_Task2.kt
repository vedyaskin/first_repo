package Collection_Map

/**
 * Дан map val people = mutableMapOf(1 to "Иван", 2 to "Петр",3 to "Лида", 4 to "Петр", 5 to "Анна").
 * Написать функцию, удаляющую элементы по введенному с клавиатуры значению.
 * Т.е., если набрали «Петр» коллекция должна стать такого вида {1=Иван, 3=Лида, 5=Анна}
 */
fun main() {
    val people = mutableMapOf(1 to "Иван", 2 to "Петр", 3 to "Лида", 4 to "Петр", 5 to "Анна")
    println("Исходный список: $people")
    while (true) {
        print("Введите имя или Enter для выхода: ")
        var input = readln()
        if (input != ""){
            people delete input
            println(people)
        }else break
    }
}

infix fun MutableMap<Int, String>.delete(string: String) {
    var toRemove = mutableMapOf<Int, String>() // сюда заносим элементы для удаления

    for (i in this) {
        if (i.value.equals(string, ignoreCase = true)) {
            toRemove.put(i.key, i.value)
        }
    }
    // удаляем элементы из people
    if (!toRemove.isEmpty()) {
        for (i in toRemove) {
            this.remove(i.key, i.value)
        }
    } else println("Такого элемента нет.")
}