package delegation_Tasks

/**
 * 3. Написать программу, которая проверяет, является ли слово палиндромом.
 */
fun main(){

    val string = "казак"
//    if ( string.equals(string.reversed())) {
//        println("Строка является палиндромом.")
//    } else println("Строка не является палиндромом.")

    var length = string.length - 1
    var isPalindrome: Boolean = true

    for (i in 0..length/2){
        if ( string[i] != string[length-i]){
            isPalindrome = false
            break
        }
    }
    if (isPalindrome) println("Строка является палиндромом.")
    else println("Строка не является палиндромом.")
}