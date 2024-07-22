package incapsulation_HW

fun main() {

    var b = 123456789
    println("b = $b")

// преобразовываем в строку
    var string: String = b.toString()

// преобразовываем в массив
    var charArray = string.toCharArray()
    // var charArray2 = CharArray(charArray.size)
    var buffer = ' '

    for (i in 0..(charArray.size - 1) / 2) {
        buffer = charArray[i]
        charArray[i] = charArray[(charArray.size - 1) - i]
        charArray[(charArray.size - 1) - i] = buffer
    }
// преобразовываем в строку
    string = charArray.concatToString()

//преобразовываем в число
    b = string.toInt()
    println("b = $b")
}