package abstract_class_HW_Task1

class Pyaterochka(val address: String, shopNumber: Int, hourOpen: Int, hourClose: Int) :
    Shop(shopNumber, hourOpen, hourClose) {
    override fun printInfo() {
        println("Пятерочка.")
        println("Адрес магазина: $address")
        super.printInfo()
    }

    override fun openingHours(hour: Int) {
        // предположим, пятерочка работает с перерывом на обед
        val lunchBreak = 13..14
        if (hour in hourOpen until lunchBreak.first || hour in lunchBreak.last + 1..hourClose) {
            println("Магазин открыт.")
        } else println("Магазин закрыт.")
    }

    // функция вычисляет выручку с учетом наценки
   // markup это наценка в %
    override fun profit(goodsForSaleValue: Double, period_days: Int, markup: Int)
    {
        var markup: Double = markup.toDouble()/100
        var result = goodsForSaleValue * (1 + markup)
        // округляем до 2-х знаков после запятой
        result = Math.round(result * 100.0) / 100.0

        println("Общая стоимость товара: $goodsForSaleValue")
        println("Выручка при наценке в ${markup * 100}% = $result")
    }

}