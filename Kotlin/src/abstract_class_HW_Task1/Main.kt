package abstract_class_HW_Task1

    fun main() {
        var magnit1 = Magnit("ул. Ленина 1", 1, 8, 22)
        magnit1.printInfo()
        magnit1.openingHours(13)
        // сделаем коэффициент порчи товара 2% в день
        magnit1.profit(10000.00, 40, 2)
        println()
        var pyaterochka = Pyaterochka("ул. Тверская 2", 2, 8, 23)
        pyaterochka.printInfo()
        pyaterochka.openingHours(13)

        // сделаем наценку 10%,
        pyaterochka.profit(10000.00, 3, 10)
    }
