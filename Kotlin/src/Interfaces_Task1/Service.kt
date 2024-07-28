package Interfaces_Task1

/**
 * 1. Написать абстрактный класс «Службы экстренного реагирования».
 * У него есть свой конструктор, содержащий свойства name и phone.
 * Он содержит функцию, характеризующий его деятельность.
 *
 * Напишите интерфейс, который содержит функцию getDescription,
 * дающую описание той или ной службы, или организации.
 */
abstract class Service(
    val name: String,
    val phoneNumber: String
) {

    // функция, характеризующая деятельность
    abstract fun activity()

}