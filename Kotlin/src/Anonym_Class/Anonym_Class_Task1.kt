package Anonym_Class

/**
 * 1. Дан массив строк. Найти самое длинное слово в массиве и количество букв в этом слове.
 *
 */

fun main(){
    val stringArray = arrayOf("апельсин", "баnnnnnnnнан", "абрикос", "Крыжовник", "яблоко")
    var maxWord = ""
    for (i in stringArray){
        if ( maxWord.length < i.length){
            maxWord = i
        }
    }
    println("Самое длинное слово: $maxWord")
    println("Количество букв: ${maxWord.length}")
}