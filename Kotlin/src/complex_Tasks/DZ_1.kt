package complex_Tasks

/**
 * 1. Дано целое число n (>0). Найти сумму 1+1/2+1/3+…+1/n (вещественное число).
 */
fun main(){
    val n = 9
    var sum : Double = 0.0
    for ( i in 1..n){
        sum += 1.0 / i
    }
    println("Сумма = $sum")
}