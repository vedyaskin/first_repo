package Generics

/**
 * 2. Создать класс параметризованный класс Person,
 * у которого свойство номера телефона в конструкторе может передаваться по – разному,
 * как в виде числа, так и в виде строки.
 * Создать Два экземпляра Person,
 * поле телефона заполнить у первого числами, у второго строкой.
 * Вывести полученную информацию о них. Person: name = имя, phone = телефон
 */

fun main() {
    val ivan = Person("Иван", 89215554433)
    val petr = Person("Петр", "+79118886677")
    println(ivan.toString())
    println(petr.toString())
}

class Person<T>(val name: String, val phone: T) {
    override fun toString(): String {
        return "Person(name='$name', phone=$phone)"
    }
}