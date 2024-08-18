package InfixFun

/**
 * Написать класс Person.
 * В конструктор он принимает свойство имени.
 * Внутри класса есть инфиксная функция say,
 * которая будет передавать сообщение объекта этого класса,
 * переданное в параметр.
 * Сообщение внутри функции выводится с помощью println.
 */

fun main(){
    val den = Person("Денис")
    den say "Привет!"
}
class Person(var name: String =""){
    infix fun say (value: String){
        println("$name говорит: $value")
    }
}