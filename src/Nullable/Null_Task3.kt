package Nullable

/**
 *  Дан массив строк array = arrayOf("Привет","как", null, "дела").
 *  Создать новый массив,
 *  который будет состоять из элементов массива array,
 *  которые не являются null. Вывести их в консоль.
 */

fun main() {
    val array = arrayOf("Привет", "как", null, "дела")
    val arrayNotNull = array.filterNotNull()
    val arrayNotNull2 = array.filter(){it != null}

    println(arrayNotNull)
    println(arrayNotNull2)

}