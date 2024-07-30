package Override_Task3

/**
 * 3. Дана строка «ПриВет, кАк деЛа».
 * Необходимо найти символы, находящиеся в верхнем регистре,
 * вывести их и посчитать их количество.
 */
fun main(){
    val string = "ПриВет, кАк деЛа"
    var count = 0
    println( string )
    print("Символы в верхнем регистре: ")
    for ( i in string ){
        if (i.isUpperCase()) {
            print("$i ")
            count++
        }
    }
    println("\nКоличество символов: $count")
}