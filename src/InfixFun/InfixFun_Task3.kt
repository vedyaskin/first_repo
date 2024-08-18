package InfixFun

/**
 * Создать data класс Point(точка), характеризующее место объекта.
 * Написать две инфиксные функции, расширяющие этот класс.
 * Они характеризуют расположение одной точки относительно другой –
 * isAbove() – описывает ситуацию, когда одна точка выше другой,
 * isRightOf – описывает ситуацию, когда одна точка правее другой.
 * В функции main создать два объекта Point и сравнить их расположение,
 * применив вышеуказанные функции.
 */

fun main() {
    val a = Point("A", 3, 9)
    val b = Point("B", 5, 7)

    println(a)
    println(b)

    a isAbove b
    a isRightOf b
}

infix fun Point.isAbove(point: Point) {
    if (this.y > point.y) {
        println("Точка ${this.name} выше точки ${point.name}")
    } else if (this.y < point.y) {
        println("Точка ${point.name} выше точки ${this.name}")
    } else {
        println("Высота у точек ${this.name} и ${point.name} одинаковая")
    }
}

infix fun Point.isRightOf(point: Point) {
    if (this.x > point.x) {
        println("Точка ${this.name} правее точки ${point.name}")
    } else if (this.x < point.x){
        println("Точка ${point.name} правее точки ${this.name}")
    } else{
        println("Координаты точек по оси Х совпадают.")
    }
}

data class Point(val name: String = "", val x: Int = 0, val y: Int = 0)