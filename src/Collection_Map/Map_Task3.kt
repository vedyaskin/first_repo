package Collection_Map

/**
 * Создать data класс Person,
 * в конструктор он принимает свойства имени, возраста и должности.
 * В главной функции создать personHashMap и заполнить его несколькими элементами,
 * где ключом будет целое число – порядковый номер, значением – объект Person.
 * Вывести полученную коллекцию в консоль.
 */
fun main() {
    val person1 = Person(name = "Ольга", age = 30, employee = "Менеджер")
    val person2 = Person(name = "Сергей", age = 25, employee = "Инженер")
    val person3 = Person(name = "Анна", age = 35, employee = "Директор")

    var personHashMap = mutableMapOf<Int, Person>()

    personHashMap add person1
    personHashMap add person2
    personHashMap add person3

    personHashMap.forEach { person ->
        println("${person.key} ${person.value}")
    }
}
// функция добавления
infix fun MutableMap<Int, Person>.add(person: Person) {
    val id = this.count() + 1
    this.put(id, person)
}
data class Person(val name: String, val age: Int, val employee: String)