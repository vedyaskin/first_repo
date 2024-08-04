package Enum_Task1

class Year {
    val months = arrayOf(
        Month("январь", Season.WINTER),
        Month("февраль", Season.WINTER),
        Month("март", Season.SPRING),
        Month("апрель", Season.SPRING),
        Month("май", Season.SPRING),
        Month("июнь", Season.SUMMER),
        Month("июль", Season.SUMMER),
        Month("август", Season.SUMMER),
        Month("сентябрь", Season.AUTUMN),
        Month("октябрь", Season.AUTUMN),
        Month("ноябрь", Season.AUTUMN),
        Month("декабрь", Season.WINTER)
    )

    fun getAllMonths() {
        var countOfMonth = 0
        for (i in months.indices) {
                println("${++countOfMonth}. ${months[i].month}\t")
        }
    }

    fun getMonth(month: String): Month? {
        val month = month.trim()
        for (i in months.indices) {
            if (months[i].month.equals(month, ignoreCase = true)) {
                return months[i]
            }
        }
        println("Месяц '$month' не существует.")
        return null
    }

    fun getSeason() {
        print("Введите месяц: ")
        var input = readln()
        val month = getMonth(input)
        if (month != null) {
            when (month.season) {
                Season.WINTER -> println("Зима")
                Season.SPRING -> println("Весна")
                Season.SUMMER -> println("Лето")
                Season.AUTUMN -> println("Осень")
            }
        }

    }
}