package sort

/**
 * Создать класс Employee, в конструкторе передать свойства имени, возраста и зарплаты.
 * Создать список сотрудников, состоящий из 5 человек.
 * Написать функции сортировки по именам, возрасту и зарплате.
 */

fun main() {
    val persons = listOf(
        Employee("Денис", 37, 80000),
        Employee("Альберт", 42, 90000),
        Employee("Анна", 25, 40000),
        Employee("Вероника", 27, 60000),
        Employee("Дмитрий", 24, 50000),
    )
    // функция сортировки по имени
    val sortedByName = fun(persons: List<Employee>) {
        println()
        println(persons.sortedBy { it.name }.joinToString(separator = "\n", prefix = "Сортировка по имени \n"))
    }

    // функция сортировки по возрасту
    val sortedByAge = fun(persons: List<Employee>){
        println()
        println(persons.sortedBy { it.age }.joinToString(separator = "\n", prefix = "Сортировка по возрасту \n"))
    }

    // функция сортировки по зарплате
    val sortedBySalary = fun(persons: List<Employee>){
        println()
        println(persons.sortedBy { it.salary }.joinToString(separator = "\n", prefix = "Сортировка по зарплате \n"))
    }

    sortedByName(persons)
    sortedByAge(persons)
    sortedBySalary(persons)
}

class Employee(val name: String, val age: Int, val salary: Int) {
    override fun toString(): String {
        return "name = $name, age = $age, salary =  $salary"
    }
}
