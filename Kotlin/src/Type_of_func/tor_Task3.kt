package Type_of_func

/**
 * 3. Дан массив val array = arrayOf(1, 2, 3, 4, 5, 6, 7).
 * Написать функцию, которая будет увеличивать элемент массива на единицу, находящийся через одну позицию.
 * Т.е. массив на выходе будет такой [2, 2, 4, 4, 6, 6, 8].
 */
fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7)
    for (i in array.indices) {
        if (i % 2 == 0){
            ++array[i]
        }
    }
    println(array.contentToString())
}