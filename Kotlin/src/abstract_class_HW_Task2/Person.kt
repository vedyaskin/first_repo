package abstract_class_HW_Task2

/**
 * 2. Написать абстрактный класс Person.
 * В конструкторе передать несколько свойств, например, имени, фамилии, возраста.
 * Написать абстрактные функции, характеризующие деятельность объекта класса и
 * одну или несколько обычных.
 * Создать два класса наследника Student и Employee.
 * Написать реализацию функций.
 */
abstract class Person (name: String, surname: String, age: Int){
    val name = name
    val surname = surname
    val age = age

    abstract fun activity()

    open fun info(){
        println("Имя: $name")
        println("Фамилия: $surname")
        println("Вoзраст: $age")
    }
}