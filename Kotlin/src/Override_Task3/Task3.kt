package Override_Task3

/**
 * 3. Дана строка «ПриВет, кАк деЛа».
 * Необходимо найти символы, находящиеся в верхнем регистре,
 * вывести их и посчитать их количество.
 */
fun main(){
    val string = "ПриВет, кАк деЛа"
    val charArray = string.toCharArray()
    var count = 0
    println( string )
    print("Символы в верхнем регистре: ")
    for ( i in charArray ){
        if (i.isUpperCase()) {
            print("$i ")
            count++
        }
    }
    println("\nКоличество символов: $count")
}