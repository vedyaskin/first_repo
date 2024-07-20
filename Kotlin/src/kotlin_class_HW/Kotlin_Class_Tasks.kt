package kotlin_class_HW

import kotlin.math.roundToInt

fun main() {
    var alligator = Helicopter()
    alligator.name = "k-52"
    alligator.weight = 10800
    alligator.speed = 260
    alligator.height = 5500
    alligator.printInfo()

    println()
    var animal = Animal()
    animal.species = "Собака"
    animal.name = "Чаки"
    animal.weight = 4
    animal.printInfo()

    toInt()
}

/**
 * 1. Создать класс вертолет со свойствами
 * название(имя), взлетный вес, скорость полета, максимальная высота полета.
 * В классе с методом main создать экземпляр этого класса,
 * например, alligator, свойствам задать конкретные значения.
 * Вывести в консоль строку:
 * «Спроектировали вертолет с названием… скоростью полета… весом… высотой полета…»
 */

class Helicopter {
    var name = ""
    var weight = 0
    var speed = 0
    var height = 0

    fun printInfo() {
        println("Задание 1")
        println(
            "Спроектировали вертолет с названием $name " +
                    "скоростью полета $speed " +
                    "весом $weight высотой полета $height"
        )
    }
}

/**
 * 2. Написать класс домашнее животное.
 * Свойствами класса будут вес,
 * кличка и принадлежность к определённому типу (коровы, гуси, собаки и так далее),
 * нужно их написать в классе.
 * В классе с главным методом создайте свое домашнее животное. Выведите в консоль:
 * println("Домашнее животное: " + … +
 *        "Кличка: " + …. +
 *        "Вес: " + …);
 */
class Animal {
    var species = ""
    var name = ""
    var weight = 0

    fun printInfo() {
        println("Задание 2")
        println(
            "Домашнее животное: " + species + "\n" +
                    "Кличка: " + name + "\n" +
                    "Вес: " + weight
        )
    }
}
/**Даны переменная с плавающей точкой, равная 5,87.
 * Необходимо привести ее к целочисленному типу.
 * 3. Даны переменная с плавающей точкой, равная 5,87.
 * Необходимо привести ее к целочисленному типу.
 */
fun toInt(){
    var a = 5.87
    var int_a = 0
    //int_a = a.roundToInt()

    var remainder = a % 1
    if ( remainder < 0.50 ){
        int_a = (a - remainder).toInt()
    } else {
        int_a = ((a - remainder) + 1).toInt()
    }

    println("Задание 3")
    println( int_a )
}
