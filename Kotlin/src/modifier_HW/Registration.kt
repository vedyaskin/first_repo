package modifier_HW

/**
 * 1. Создать класс Registration с полями email и password.
 * Для этого свойства email написать геттер,
 * который возвращает значение этого поля в верхнем регистре.
 * Для поля password написать сеттер, который контролирует,
 * чтобы длина пароля была не менее 6 символов, иначе выводит сообщение,
 * что не соответствует его длина.
 */
fun main() {
    val reg = Registration()
    reg.setEmail()

    // если email введен верно, то вводим пароль
    if (reg.getEmail() != "") {
        println(reg.getEmail())
        reg.setPassword()
    }
}

class Registration {
    private var email = ""
    private var password = ""

    fun getEmail() = email.uppercase()

    fun setEmail() {
        while (true) {
            println("Введите email: ")
            email = readln()

            // если пользователь передумал регистрироваться и вводит 'q!',
            // то выходим из цикла
            if (email.equals("q!", ignoreCase = true)) {
                email = ""
                break
            }
            // если email введен без '@', то просим ввести его еще раз
            else if (email.contains('@') == false) {
                println("Введен неверный email")
                println("Попробуйте еще раз. Для выхода введите q! \n")
                email = ""
            } else break
        }
    }

    fun setPassword() {
        var count = 3
        while (count-- > 0) {
            print("Введите пароль: ")
            password = readln()
            if (password.length < 6) {
                println("Длина пароля меньше 6 символов.")
                println("Попробуйте еще раз.")
                println("Осталось попыток: $count")
            } else {
                println("Успешно.")
                break
            }
        }
    }
}