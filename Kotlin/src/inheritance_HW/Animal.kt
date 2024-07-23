package inheritance_HW

/**
 * 1. Создать суперкласс Animal(животное) со свойствами веса и имени.
 * Написать функцию, которая описывает прием пищи животного.
 * Наследовать от него подклассы Dog, Cat, используя все возможности суперкласса.
 * У каждого животного определить по одной своей функции.
 */

open class Animal(name: String, weight: Int) {

    var weight = weight
    var name = name

    open fun eating() {
        println("Животное ест.")
    }

    override fun toString(): String {
        return "Animal(масса = $weight, имя = $name)"
    }
}

class Dog(name: String, weight: Int, breed: String) : Animal(name, weight) {

    var breed = breed

    fun purpose() {
        println("Предназначение - охранять.")
    }

    override fun eating() {
        println("Ест мясо.")
    }

    override fun toString(): String {
        return "Собака. \nИмя: $name, \nПорода: $breed, \nМасса: $weight кг."
    }
}

class Cat(name: String, weigt: Int) : Animal(name, weigt) {

    fun purpose() {
        println("Предназначение - ловить мышей.")
    }

    override fun eating() {
        println("Ест рыбу.")
    }

    override fun toString(): String {
        return "Кот. \nИмя: $name, \nМасса: $weight кг."
    }
}

fun main() {
    var dog = Dog("Мухтар", 25, "Овчарка")
    println(dog.toString())
    dog.eating()
    dog.purpose()

    println("=================")
    var cat = Cat("Барсик", 5)
    println(cat.toString())
    cat.eating()
    cat.purpose()
}