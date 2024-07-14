package Arrays_HW

/**
 * Дан массив размерностью size.
 * Вывести в том же порядке все четные числа из данного набора и
 * количество K таких чисел.
 */
fun main() {
    val size = 10
    var K = 0 // количество четных элементов

    // заполняем массив
    val array = Array(size) { 0 }
    for (i in 0..<size) {
        array[i] = i
    }
    println("Исходный массив: ${array.contentToString()}")
    print("Четные элементы: ")
    for ( i in array){
        if (i % 2 == 0) {
            print("$i ")
            K++
        }
    }
    println("\nКоличество четных элементов : $K")
}