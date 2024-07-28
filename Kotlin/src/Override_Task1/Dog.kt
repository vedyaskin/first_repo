package Override_Task1

open class Dog(
    kingdom: String = "Животные", // Царство
    phylum: String = "Хордовые", // Тип
    classType: String = "Млекопитающие", // Класс
    order: String, // Отряд
    family: String, // Семейство
    genus: String, // Род
    species: String, // Вид
    adaptation: String,// Функциональное назначение или вид адаптации
    subspecies: String = "", // Подвид
    breed: String = "" // Порода
) : Bird(
    kingdom,
    phylum,
    classType,
    order,
    family,
    genus,
    species,
    adaptation
) {
    open var subspecies: String = subspecies
        set(value) {
            field = if (value.isEmpty()) "Не имеет подвида"
            else value
        }
    open var breed = breed
        set(value) {
            field = if (value.isEmpty()) "Не имеет породы"
            else value
        }

    init {
        this.subspecies = subspecies
        this.breed = breed
    }

    /*
        Переопределяем свойство information.

        Если животное дикое, то оно не имеет породы.
        Дикие животные классифицируются на подвиды.
        Породу имеют только домашние животные.

        Если животное домашнее, то выводим "породу", а "подвид" не выводим.
        А вместо "Способ адаптации" выводим "Функциональное назначение"

        Если дикое, то наоборот
        Выводим "подвид", а вместо "Функциональное назначение" выводим "Способ адаптации"
     */
    override val information: String
        get() =
            if (breed.equals("Не имеет породы")) {
                "Подвид: $subspecies \n" +
                "${super.information}\n" +
                        "Способ адаптации: $adaptation"

            } else {
                "Порода: $breed \n" +
                        "${super.information}\n" +
                        "Функциональное назначение: $adaptation"
            }


    override fun printInfo() {
        println("-----------------------------------------------")
        println(information)
    }
}



