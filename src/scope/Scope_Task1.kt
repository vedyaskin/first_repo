package scope

/**
 * Создайте scope – функцию let,
 * которая будет вызываться у строки.
 * В лямбда – выражении этой функции выводится в консоль сам объект и длина этой строки.
 */

fun main(){
    val string: String? = "строка"
    string?.let{
        println(string)
        println(string.length)
    }

}