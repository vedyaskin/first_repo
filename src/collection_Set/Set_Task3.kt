package collection_Set



/**
 * 	Создать функцию removeDuplicates (collection: Collection<T>?),
 * 	которая будет возвращать набор неповторяющихся элементов.
 * 	Обратите внимание, что в параметры функции передан
 * 	элемент Collection параметризованного типа.
 */
fun main() {
    fun <T> removeDuplicates(collection: Collection<T>?): Set<T>? {
        return collection?.toSet()
    }

    val numbersOne: Collection<Int>? = null
    val numbersTwo = mutableListOf("Яблоко","Киви", "Арбуз","Киви","Яблоко")
    val numbersThree = mutableListOf(1, 3, 5, 5, 3, 1)

    println(removeDuplicates(numbersOne))
    println(removeDuplicates(numbersTwo))
    println(removeDuplicates(numbersThree))
}

