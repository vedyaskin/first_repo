package abstract_class_HW_Task1

/**
 * Написать абстрактный класс Shop(магазин).
 * Написать несколько свойств класса, две абстрактные функции и одну обычную,
 * характеризующих работу магазина.
 * Создать два класса наследника магазин Magnit и Pyaterochka.
 * Написать реализацию функций.
 */
abstract class Shop(val shopNumber: Int, hourOpen: Int, hourClose: Int) {

    var hourOpen = setCorrectHour(hourOpen) // час открытия
    val hourClose = setCorrectHour(hourClose) // час закрытия

    private fun setCorrectHour(hour: Int): Int {
        return when (hour) {
            in 0..23 -> hour
            else -> {
                println("Недопустимое значение часа")
                return 255
            }
        }
    }

    open fun printInfo() {
        println("Номер магазина: $shopNumber")
        println("Время работы: с $hourOpen до $hourClose")
    }

    // функция, которая вычисляет, работает магазин на текущий час или нет
    abstract fun openingHours(hour: Int)

    // функция прогнозирует выручку или убыток, при реализации товара за N дней
    // принимает параметры: стоимостьПринятогоТовара, период дней, коэффициент чего-либо
    abstract fun profit(goodsForSaleValue: Double, period_days: Int, coef: Int)

}






