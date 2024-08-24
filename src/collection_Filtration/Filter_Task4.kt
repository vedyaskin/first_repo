package collection_Filtration

/**
 *  4. Дан map prizeMap, описывающий ключом порядковый номер сотрудника,
 *  значение характеризует процент премии сотруднику.
 *  Отфильтровать исходный map с таким расчетом,
 *  чтобы получить данные сотрудников,
 *  чей порядковый номер оканчивается на «5» и процент премии больше 20.
 */
fun main() {
    val prizeMap = mapOf(
        1 to listOf("Андрей", 20),
        2 to listOf("Ольга", 30),
        3 to listOf("Иван", 50),
        4 to listOf("Мария", 25),
        5 to listOf("Сергей", 40),
        15 to listOf("Екатерина", 35),
        25 to listOf("Григорий", 45)
    )
    val filterMap = prizeMap.filter { (key, value) ->
        key % 10 == 5 && (value[1] as Int) > 20
    }
    println(filterMap)
}