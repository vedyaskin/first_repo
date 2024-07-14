package Arrays_HW

/**
 *  Создать массив из 10 чисел с плавающей точкой. Найти произведение его элементов.
 */
fun main(){
    val numbers = doubleArrayOf(1.0, 2.3, 3.0, 4.3, 5.8, 6.0, 7.0, 8.0, 9.0, 10.0)
    var multip : Double = 1.0;
    for ( i in numbers) {
        multip *= i
    }
    println("Произведение элементов = $multip")
}