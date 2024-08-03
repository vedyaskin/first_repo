package Data_Classes
/**
 * Представляет билет на киносеанс.
 * Содержит информацию о названии фильма, номере места и времени начала сеанса.
 */

data class Ticket( val title: String, val seat: Int, val time: String) {

    override fun toString(): String = "Фильм: $title, Место: $seat, Время: $time"

}

