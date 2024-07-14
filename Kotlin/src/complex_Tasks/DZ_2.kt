package complex_Tasks

/**
 * Даны два целых числа a и b (a<b). Найти сумму квадратов всех целых чисел от a до b включительно.
 */
fun main(){
    val a = 4
    val b = 9
    var sum = 0
    for (i in a..b){
        print("$i ")
        sum += i * i
    }
    println( "\nСумма квадратов = $sum"  )
}