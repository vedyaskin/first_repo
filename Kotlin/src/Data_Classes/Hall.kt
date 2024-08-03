package Data_Classes
/**
 * Представляет кинозал.
 * Управляет состоянием мест (свободно/занято) и предоставляет методы для работы с местами.
 * Параметр seat определяет общее количество мест в зале.
 */
open class Hall(val seat: Int) {
    var arrayOfSeats = Array(seat) { "" }

    fun setSeat() {
        for (i in arrayOfSeats.indices) {
            arrayOfSeats[i] = (i + 1).toString()
        }
    }

    fun setSoldSeat(seat: Int) {
        arrayOfSeats[seat - 1] = "X"
    }

    fun getAllSeats() {
        println("Схема зала:")
        println("X - занято, число - свободно")
        println("--------------------------------")
        for ((index, value) in arrayOfSeats.withIndex()) {
            if ((index + 1) % 5 != 0) {
                print("$value\t")
            } else println(value)
        }
    }

    fun getFreeSeat(seat: Int): Boolean {

        if (seat > this.seat) {
            println("Такого места нет. Количество мест ${this.seat}")
            return false
        } else if (arrayOfSeats[seat - 1] == "X") {
            println("Место занято.")
            return false
        } else return true
    }
}



