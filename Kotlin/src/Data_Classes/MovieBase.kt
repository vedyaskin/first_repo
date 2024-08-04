package Data_Classes

/**
 * Представляет базу данных фильмов.
 * Предоставляет методы для выбора фильма.
 * Принимает варьируемое количество объектов Movie при инициализации.
 */
class MovieBase(vararg val movies: Movie) {

    fun printAllInfo() {
        for (movie in movies) {
            println("Фильм: ${movie.title} | Время: ${movie.time}")
        }
    }

    fun selectMovieTitle(): String {

        while (true) {
            println("Выберите фильм: ")
            var number = 0
            var titleIndexes = ""
            for (i in movies.indices) {
                var dublicat = false
                for (j in 0 until i) {
                    if (movies[i].title == movies[j].title)
                        dublicat = true
                }
                if (dublicat == false) {
                    println("№ ${++number} : ${movies[i].title}")
                    titleIndexes += "$i"
                }
            }
            val charArray = titleIndexes.toCharArray()

            var index = getIndex(charArray)
            if (index >= 0) {
                return movies[index].title
                break
            } else {
                println("Неправильное значение.")
                continue
            }
        }
    }

    fun selectTimeOfMovie(title: String): String {
        while (true) {
            println("Выбран фильм: $title")
            println("Выберите сеанс:")
            val title = title
            var session = 0 // номер сеанса
            var sessionIndexes = "" //сюда будут заноситься индексы, указывающие на позиции фильмов в массиве

            // выводим на экран все сеансы выбранного фильма
            for (i in movies.indices) {
                if (movies[i].title == title) {
                    println("Сеанс ${++session}: ${movies[i].time}")
                    sessionIndexes += "$i"
                }
            }
            // здесь выбираем сеанс и вычисляем под каким индексом
            // находится фильм
            val charArray = sessionIndexes.toCharArray()
            var index = getIndex(charArray)

            if (index >= 0) {
                return movies[index].time
                break
            } else {
                println("Неправильное значение.")
                continue
            }
        }
    }

    fun selectSeat(title: String, time: String): Int {
        val indexOfMovie = getIndex(title, time)
        while (true) {
            println("Выберите место: ")
            movies[indexOfMovie].getAllSeats()
            val input = readln()?.toIntOrNull()

            if (input != null) {  //&& movies[indexOfMovie].getFreeSeat(input)) { //input <= movies[indexOfMovie].numberOfSeat) {

                if (movies[indexOfMovie].isFreeSeat(input)) {
                    movies[indexOfMovie].setSoldSeat(input)
                    return input
                    break
                }
            } else println("Неправильное значение.")
        }
    }

    fun getIndex(charArray: CharArray): Int {

        var input = readln()?.toIntOrNull()
        if (input != null && input <= charArray.size) {
            input -= 1
            val index = charArray[input] - '0'
            return index

        } else {
            //println("Неправильное значение.")
            return -1
        }

    }

    fun getIndex(title: String, time: String): Int {
        for (i in movies.indices) {
            if (movies[i].title == title && movies[i].time == time) {
                return i
            }
        }
        return -1
    }
}