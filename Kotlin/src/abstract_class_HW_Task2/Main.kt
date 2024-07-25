package abstract_class_HW_Task2

fun main() {
    val student = Student("Иван", "Иванов", 25)
    student.fieldOfStudy = "криптография"
    student.speciality = "защита информации"
    student.info()
    student.activity()
    println("//-------------------------------------------")
    val employee = Employee("Сидор", "Сидоров", 35, "Врач")
    employee.kindOfActivity = "Стоматолог"
    employee.info()
    employee.activity()
}