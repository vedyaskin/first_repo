package Data_Classes

val numberOfSeat = 15 // количество мест в зале


// создаем базу фильмов
var base = MovieBase(
    Movie("Рэмбо", "15:00", numberOfSeat),
    Movie("Рэмбо", "19:00", numberOfSeat),
    Movie("Рэмбо2", "22:00", numberOfSeat),
    Movie("Рэмбо3", "19:00", numberOfSeat),
    Movie("Рэмбо2", "12:00", numberOfSeat)
)

//максимально возможное количество билетов
val numberOfTickets = numberOfSeat * base.movies.size

// массив, содержащий проданные билеты
var archiveArray: Array<Ticket> = Array<Ticket>(numberOfTickets) { Ticket("", 0, "") }


fun main() {

    while (true) {
        println("--------------------------------")
        println("Выберите действие")
        println("1. Продать билет.")
        println("2. Вывести свободные места.")
        println("3. Вывести проданные билеты.")
        println("q! для выхода.")
        println("--------------------------------")

        val input = readLine()
        if (input == "q!") {
            println("Программа завершена.")
            break
        }

        val action = input?.toIntOrNull()
        when (action) {
            1 -> sellTicket2()
            2 -> base.movies[selectMovie()].getAllSeats()
            3 -> printTickets()
            else -> println("Неправильный ввод.")
        }
    }
}

fun selectMovie(): Int {
    val title = base.selectMovieTitle()
    val time = base.selectTimeOfMovie(title)
    println("Выбран фильм: $title в $time")
    return base.getIndex(title, time)
}

fun printTickets() {
    for (i in archiveArray) {
        if (i.title != "") {
            println(i.toString())
        }
    }
}

fun sellTicket2() {
    while (true) {
        val index = selectMovie()
        val title = base.movies[index].title
        val time = base.movies[index].time
        val seat = base.selectSeat(title, time)

        for (i in archiveArray.indices) {
            if (archiveArray[i].title == "") {
                archiveArray[i] = Ticket(title, seat, time)
                break
            }
        }
        println("Куплен билет на фильм $title в $time, место $seat")
        base.movies[base.getIndex(title, time)].getAllSeats()
        break
    }
    println("Для продолжения нажмите Enter")
    readln()
}