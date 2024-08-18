package scope

/**
 * Дан массив целых чисел.
 * С помощью scope – функции with вывести в консоль данный массив,
 * количество элементов массива, сумму элементов массива.
 */
fun main(){
    val array = arrayOf(1,2,3,4,5)
    with(array) {
        println(this.contentToString())
        println(this.sum())
    }
}
