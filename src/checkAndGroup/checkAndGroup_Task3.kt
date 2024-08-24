package checkAndGroup

/**
 * Дан список телефонов по году выпуска phoneToYear.
 * Не забывайте он может выглядеть как map(ключ - значение),
 * но на самом деле внутри себя будет содержать объект Pair.
 * Необходимо с группировать объекты по годам выпуска телефонов.
 * Исходный список, например, такой.
 *
 * val phoneToYear = listOf(
 * "Nexus One" to 2010,
 * "Pixel 2" to 2017,
 * "Pixel 4a" to 2020,
 * "iPhone 4" to 2010,
 * "iPhone X" to 2017,
 * "Galaxy Note 8" to 2017,
 * "Galaxy S11" to 2020
 * )
 */

fun main(){
    val phoneToYear = listOf(
         "Nexus One" to 2010,
         "Pixel 2" to 2017,
         "Pixel 4a" to 2020,
         "iPhone 4" to 2010,
         "iPhone X" to 2017,
         "Galaxy Note 8" to 2017,
         "Galaxy S11" to 2020
    )
    // группируем по году
    val groupByYear = phoneToYear.groupBy { it.second }

//   Альтернативный способ итерации, демонстрирующий другой подход к работе с Map
//    for (year in groupByYear){
//        println(year.key)
//        for (phone in year.value){
//            println(phone.first)
//        }
//        println()
//    }

    for ((year, phones) in groupByYear){
        println(year)
        for (phone in phones){
            println(phone.first)
        }
        println()
    }
}