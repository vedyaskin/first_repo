package Anonym_Class_Task3

/**
 * 3. Написать абстрактный класс Printer со своими свойствами и функциями.
 * В функции main создать несколько объектов Printer.
 */
fun main(){
    val hp = object : Printer("HP")
    {
        override fun printing() {
            println("Принтер $name начал печать.")
        }

        override fun notPrinting() {
            println("Принтер $name закончил печать.")
        }
    }

    val mfp_samsung = object : Printer("Samsung"){
        fun scanning(){
            println("МФУ $name сканирует документ.")
        }
        fun copying(){
            println("МФУ $name копирует документ.")
        }
        override fun printing() {
            println("Принтер $name начал печать.")
        }

        override fun notPrinting() {
            println("Принтер $name закончил печать.")
        }
    }
    hp.printing()
    hp.notPrinting()

    mfp_samsung.scanning()
    mfp_samsung.copying()
    mfp_samsung.printing()
    mfp_samsung.notPrinting()
}