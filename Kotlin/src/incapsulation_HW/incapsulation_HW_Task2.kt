package incapsulation_HW

/**
 * 2. Дана переменная a – целое число.
 *  Используя составные операторы присваивания необходимо выполнить операции:
 *   - a увеличить на 7,
 *   - полученное число уменьшить на 4,
 *   - далее полученный результат умножить на 2
 *   - и найти остаток от деления разделив на 3.
 * 3. Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа. 753 -> 357.
 *
 */
fun main() {
    println("============ Задание 2 ===================")
    var a = 1
    println("a = $a")
    a += 7
    println("a += 7 = $a")
    a -= 4
    println("a -= 4 = $a")
    a *= 2
    println("a *= 2 = $a")
    a %= 3
    println("a %= 3 = $a")

    println("============ Задание 3 ===================")
    var b = 57
    println("b = $b")

    // преобразовываем в строку
    var string: String = b.toString()

    // преобразовываем в массив
    var charArray = string.toCharArray()

    // меняем местами с помощью буфера
    var buffer: Char = charArray[0]
    charArray[0] = charArray[1]
    charArray[1] = buffer
// преобразовываем в строку
    var string2 = charArray.concatToString()

    //преобразовываем в число
    b = string2.toInt()
    println("b = $b")

}


