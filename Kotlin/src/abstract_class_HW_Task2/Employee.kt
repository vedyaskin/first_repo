package abstract_class_HW_Task2

class Employee(name: String, surname: String, age: Int, speciality: String) :
    Person(name, surname, age) {

    var speciality = speciality
    var kindOfActivity = ""

    override fun activity() {
        println("Направление: $kindOfActivity")
    }

    override fun info() {
        super.info()
        println("Должность: $speciality")
    }
}