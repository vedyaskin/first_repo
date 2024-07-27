package Interfaces_Task1

fun main() {
    val ambulance = Emergency_response("Скорая помощь", "112")
    ambulance.action = "Круглосуточная экстренная медицинская служба"
    ambulance.getDescription()
    ambulance.activity()
    println("---------------------------------------------------------")
    val fireDepartment = Emergency_response("Пожарная служба", "112")
    fireDepartment.action = "Круглосуточная защита от пожаров и других чрезвычайных ситуаций"
    fireDepartment.getDescription()
    fireDepartment.activity()
}