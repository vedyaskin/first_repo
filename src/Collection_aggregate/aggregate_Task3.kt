package Collection_aggregate

/**
 * Создать data класс Player, который характеризует игрока с
 * именем, количеством заработанных очков и выигранных денег.
 * Создать список таких игроков с произвольными данными в конструкторе.
 * Посчитать и вывести в консоль общее количество очков и выигранных денег.
 */
fun main(){
    val players = listOf(
        Player("Иван", 10, 100),
        Player("Федор", 15, 120),
        Player("Алексей", 8, 90),
        Player("Михаил", 12, 110),
        Player("Сергей", 18, 140)
    )
    val sumOfScore = players.sumOf { it.score }
    val sumOfWins = players.sumOf { it.win }

    println("Сумма очков: $sumOfScore")
    println("Сумма выигранных денег: $sumOfWins")
}
data class Player (val name: String, val score: Int, val win: Int)