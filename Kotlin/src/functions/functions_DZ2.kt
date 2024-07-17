package functions

/**
 * Написать функцию, которая принимает два целых числа a и b (a<b).
 * Она вычисляет произведение всех целых чисел от a до b включительно.
 */
fun main (){
    multiplication(5,9)
}
fun multiplication (a : Int, b : Int ){
    var result = 1
    for (i in a..b){
        result *= i
    }
    println(result)
}