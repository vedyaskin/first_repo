package Collection_Map

/**
 * Создать data класс Person,
 * в конструктор он принимает свойства имени, возраста и должности.
 * В главной функции создать personHashMap и заполнить его несколькими элементами,
 * где ключом будет целое число – порядковый номер, значением – объект Person.
 * Вывести полученную коллекцию в консоль.
 */
fun main(){
    val person1 = Person(name = "Ольга", age = 30, employee = "Менеджер")
    val person2 = Person(name = "Сергей", age = 25, employee = "Инженер")
    val person3 = Person(name = "Анна", age = 35, employee = "Директор")

    val personHashMap = hashMapOf(
        1 to person1,
        2 to person2,
        3 to person3
    )
    personHashMap.forEach{person ->
        println("${person.key} ${person.value}")
    }
}
data class Person(val name: String, val age: Int, val employee: String)