package abstract_class_HW_Task1

class Magnit(val address: String, shopNumber: Int, hourOpen: Int, hourClose: Int) :
    Shop(shopNumber, hourOpen, hourClose) {
    val name = "Магнит"

    override fun openingHours(hour: Int) {

        if (hour in hourOpen..hourClose) {
            println("Магазин открыт.")
        } else println("Магазин закрыт.")
    }

    // функция прогнозирует выручку или убыток, при реализации
    // скоропортящегося товара за N дней
    override fun profit(goodsForSaleValue: Double, period_days: Int, spoilage: Int) {

        var spoilage: Double = spoilage.toDouble()/100
        // вычисляем оставшуюся долю стоимости товаров после учета порчи
        // Из единицы (что представляет 100% начальной стоимости товаров) вычитается общая доля порчи.
        var goodFood = (1 - (period_days * spoilage))

        var result = goodsForSaleValue * goodFood

        // округляем до 2-х знаков после запятой
        result = Math.round(result * 100.0) / 100.0

        println("Общая стоимость товара: $goodsForSaleValue")
        println("коэффициент порчи товара: ${spoilage*100}% в день")
        println("При реализации за $period_days день/дней" )
        if (result >= 0) {
            println("Выручка = $result руб.")
        } else if ((result + goodsForSaleValue) < 0) {
            println("Убыток = ${goodsForSaleValue * -1} руб.")
        } else {
            println("Убыток = $result")
        }
    }

    override fun printInfo() {
        println("Магнит.")
        println("Адрес магазина: $address")
        super.printInfo()
    }
}