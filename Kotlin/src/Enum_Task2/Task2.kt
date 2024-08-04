package Enum_Task2

/**
 * Дана строка «Шумоизоляция». Посчитать количество повторяющихся символов.
 */
fun main() {
    val string = "Шумоизоляция".lowercase()
    println(string)
    var symbols = ""
    for (i in string.indices) {
        for (j in  i..<string.length) {
            if (i != j && string[i] == string[j]) {
                var isAlreadyFound = false
                for (k in symbols){
                    if (string[j] == k) {
                        isAlreadyFound = true
                        break
                    }
                }
                if (!isAlreadyFound) symbols += string[j]
                break
            }
        }
    }
    println(symbols)
    println("Количество повторяющихся символов: ${symbols.length}")
}