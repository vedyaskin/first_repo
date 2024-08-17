package Extension_Functions
import kotlin.math.sqrt
/**
 * 1. Написать функцию расширения возведения в квадрат целого числа.
 * 2. Написать функцию расширения конкатенации строк.
 * 3. Написать функцию расширения определения последнего индекса в строке.
 * 4. Написать функцию получения квадратного корня из целого числа.
 */

fun main(){
    val value = 16
    val string_1 = "hello"
    val string_2 = "world"

    print("Квадрат числа $value: ")
    println(value.getValueSquare())

    print("Конкатенация строк $string_1 и $string_2: ")
    println(string_1.concat(string_2))

    print("Последний индекс строки $string_2: ")
    println(string_2.lastIndex())

    print("Квадратный корень числа $value: ")
    println(value.getSquareRoot())

}

// возведение в квадрат
fun Int.getValueSquare(): Int = this * this

// конкатенация строк
fun String.concat(string: String): String = this + string

// определение последнего индекса в строке
fun String.lastIndex(): Int = this.length - 1

// получение квадратного корня из целого числа.
fun Int.getSquareRoot():Double = sqrt(this.toDouble())