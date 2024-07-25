package abstract_class_HW_Task2

class Student(name: String, surname: String, age: Int ) :
    Person(name, surname, age) {

    var status = "Студент"
    var fieldOfStudy = "" //сфера изучения
    var speciality = ""

    override fun activity() {
        println("Сфера изучения: $fieldOfStudy")

    }

    override fun info() {
        super.info()
        println(status)
        println("Специальность: $speciality")
    }
}