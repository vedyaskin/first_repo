package type_Conversion

/**
 * Дана строка, содержащая в себе значение 12.3.
 * Преобразовать ее
 * в целое число,
 * число с плавающей точкой,
 * число в двоичной системе представления и
 * вывести в консоль.
 * Для части преобразований, например, в двоичное представление,
 * необходимо сделать несколько преобразований, чтобы целое число перевести в двоичное.
 */
fun main() {
    val string = "12.3"
    val strDouble = string.toDouble()
    val strInt = strDouble.toInt()

    val strBinary = fun(a: Int): String {
        fun subfun(a: Int, bin: String = ""): String {
            var b = bin
            return if (a == 0) {
                b
            } else {
                b += (a % 2).toString()
                subfun(a / 2, b)
            }
        }
        return subfun(a, "").reversed()
    }

    println(strDouble)
    println(strInt)
    println(strBinary(strInt))
}