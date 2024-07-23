package inheritance_HW

/**
 * 2. Создать классы Nokia и Sony.
 *  Наследовать каждый из них от суперклассов Smartphone и IPhone.
 *  Создать несколько свойств в суперклассах и функцию звонка.
 */
open class Smartphone(screen: Double, cpu: String, memory: String) {
    var screen = screen
    var cpu = cpu
    var memory = memory

    fun calling() {
        println("Телефон звонит.")
    }

    open fun printInfo() {
        println("Диагональ экрана: $screen")
        println("Процессор: $cpu")
        println("Количество памяти: $memory")
    }
}

open class IPhone(screen: Double, cpu: String, memory: String) : Smartphone(screen, cpu, memory) {
    var name = ""
    var os = ""
    var feature = ""

    constructor(name: String, screen: Double, cpu: String, memory: String) : this(screen, cpu, memory) {
        this.name = name
    }

    override fun printInfo() {
        if (name != "") println("Модель: $name")
        super.printInfo()
        if (os != "") println("OS: $os")
        if (feature != "") println("Oсобенность: $feature")



    }
}

class Sony(screen: Double, cpu: String, memory: String) : IPhone(screen, cpu, memory) {

}

class Nokia(name: String, screen: Double, cpu: String, memory: String) : IPhone(name, screen, cpu, memory) {

}

fun main() {
    var iphone = IPhone(6.7, "A17 Pro", "256 ГБ, 512 ГБ или 1 ТБ")
    iphone.name = "iPhone 15 Pro"
    iphone.os = "iOS 17"
    iphone.feature = "титановый корпус"
    iphone.printInfo()

    iphone.calling()
    println("======================================")

    var sony = Sony(6.5, "Qualcomm Snapdragon 888", "256 ГБ")
    sony.name = "Sony Xperia 1 III"
    sony.os = "Android 11"
    sony.feature = "Защита от воды и пыли: IP65/IP68, Поддержка 5G"
    sony.printInfo()

    sony.calling()
    println("===================================")

    var nokia = Nokia("Nokia X20", 6.67, "Qualcomm Snapdragon 480 5G", "128")
    nokia.printInfo()
    nokia.calling()
}
