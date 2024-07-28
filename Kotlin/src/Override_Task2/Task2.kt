package Override_Task2

/**
 * 2. Дан массив строк. Найти самое длинное слово в массиве и количество букв в этом слове.
 */
fun main(){
    val array = arrayOf("яблоко", "груша", "апельсин", "банан", "киви", "виноград", "манго")
    var maxWord = 0
    var count = 0
    for (i in array){
        if (i.length > maxWord ) {
            maxWord = i.length
            count++
        }
    }
    println(array[count])
    println(array[count].length)
}