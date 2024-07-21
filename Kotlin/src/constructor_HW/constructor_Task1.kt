package constructor_HW

/**
 * 1. Создать класс Box(коробка),
 * у которого есть свойства width, height, depth.
 * Написать функцию вычисления объёма коробки в классе Box.
 * В классе с функцией main создать экземпляр класса Box,
 * в конструктор класса передать свойства, задать им значения,
 * вызвать функцию вычисления объема и вывести его на экран.
 */
private class Box (val weight: Int,val height: Int, val depth: Int) {

    fun volumeOfBox(): Int = weight * height * depth

}
fun main(){
    val box = Box(3,4,6)
    println(box.volumeOfBox())
}