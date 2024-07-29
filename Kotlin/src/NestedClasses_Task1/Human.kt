package NestedClasses_Task1

/**
 * 1. Создать класс Human(человек).
 * В нем создать несколько внутренних классов,
 * например, head(голова),
 * legs(ноги), в каждом из классов напишите функции этой части тела.
 * В главной функции опишите модель человека, вызвав всю функциональность написанных классов.
 */
class Human(val name: String) {

    // создаем экземпляры внутренних классов
    val head = Head()
    val legs = Legs(name)

    // создаем внутренние классы
    inner class Head() {
        fun thinks() = "$name думает."
        fun eats() = "$name ест."
    }

    class Legs(val name: String) {
        fun walking() {
            println("Человек по имени $name идет.")
        }

        fun standing() {
            println("Человек по имени $name стоит.")
        }
    }
}

fun main() {
    val vasya = Human("Вася")

    println(vasya.head.eats())
    println(vasya.head.thinks())

    vasya.legs.walking()
    vasya.legs.standing()

}