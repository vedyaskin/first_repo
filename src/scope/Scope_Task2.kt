package scope

/**
 * Создать класс City, в конструкторе передается название города и population(население).
 * В главной функции создать его экземпляр, в конструктор передать название,
 * через функцию apply объекту назначить население в любом количестве.
 * Всю информацию об объекте, созданного City вывести в консоль.
 */

fun main(){
    val spb = City("Санкт-Петербург")
    spb.apply {
        population = 5600000
    }
    println(spb.toString())
}
class City (val name: String = "", var population: Int? = null ){
    override fun toString(): String {
        return "City(name = '$name', population = $population)"
    }
}