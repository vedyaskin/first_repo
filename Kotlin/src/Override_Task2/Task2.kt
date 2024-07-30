package Override_Task2

/**
 * 2. Дан массив строк. Найти самое длинное слово в массиве и количество букв в этом слове.
 */
fun main(){
    val array = arrayOf("яблоко", "груша", "банан", "киви", "виноград", "манго", "апельсин")
    var wordLength = 0
    var word = ""
    for (i in array){
        if (i.length > wordLength ) {
            wordLength = i.length
            word = i
        }
    }
    println( word )
    println(word.length)
}