package Data_Classes
/**
 * Представляет конкретный киносеанс.
 * Содержит информацию о фильме, времени сеанса и связанном с ним зале.
 * Параметры включают название фильма, время начала сеанса и количество мест для этого сеанса.
 */
class Movie(val title: String, val time: String, val numberOfSeat: Int) {

    var hall = Hall(numberOfSeat)
    init {
        hall.setSeat()
    }

    fun getAllSeats (){
        hall.getAllSeats()
    }
    fun getFreeSeat(seat: Int): Boolean {
        return hall.getFreeSeat(seat)
    }
    fun setSoldSeat(seat: Int) {
        hall.setSoldSeat(seat)
    }

}