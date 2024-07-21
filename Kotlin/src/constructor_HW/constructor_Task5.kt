package constructor_HW

/**
 *  Создайте класс Car.
 *  В классе есть конструктор с параметрами массы, скорости.
 *  В классе с функцией main создайте экземпляр этого класса и
 *  задайте там параметры в конструктор.
 *  Напишите функции движения и остановки автомобиля.
 */
class Car (val weight: Int, val speed: Int ){
    fun move():String = "Машина едет"
    fun stop():String = "Машина стоит"
    override fun toString(): String {
        return "Car(weight=$weight, speed=$speed)"
    }

}
fun main(){
    val car = Car(1500, 180)
    println(car.toString())
    println(car.move())
    println(car.stop())
}