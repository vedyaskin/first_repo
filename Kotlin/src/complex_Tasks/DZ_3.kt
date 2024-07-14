package complex_Tasks

/**
 * Даны целые числа A и B (A<B).
 * Вывести все целые числа от A до B включительно;
 * при этом число A должно выводиться 1 раз,
 * число A+1 должно выводиться 2 раза и т. д.
 * (допустим a = 3, b = 5 à 3,4,4,5,5,5)
 */
fun main(){
    val A = 3
    val B = 5
    var count = 0
    for ( i in A..B ){
        count++
        repeat( times = count ) { it: Int ->
            print( "$i ")
        }
    }
}
