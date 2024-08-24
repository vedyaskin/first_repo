package scope

/**
 * Создайте scope – функцию let,
 * которая будет вызываться у строки.
 * В лямбда – выражении этой функции выводится в консоль сам объект и длина этой строки.
 */

fun main(){
    val string = "строка"
    string.let{
        println(it)
        println(it.length)
    }

}