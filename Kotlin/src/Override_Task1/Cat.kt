package Override_Task1

class Cat(
    kingdom: String = "Животные", // Царство
    phylum: String = "Хордовые", // Тип
    classType: String = "Млекопитающие", // Класс
    order: String, // Отряд
    family: String, // Семейство
    genus: String, // Род
    species: String, // Вид
    adaptation: String, // Вид адаптации
    subspecies: String = "", // Подвид
    breed: String = "" // Порода
) : Dog(
    kingdom,
    phylum,
    classType,
    order,
    family,
    genus,
    species,
    adaptation,
    subspecies,
    breed
) {
    override var subspecies = subspecies
        get() = if (field.equals("")) "Не имеет подвида" else field
    override var breed = breed
        get() = if (field.equals("")) "Не имеет породы" else field

    override fun printInfo() {
        super.printInfo()
    }

}