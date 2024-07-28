package Override_Task1

fun main() {
    // Создаем экземпляр класса Bird (например, воробей)
    val bird = Bird(
        order = "Воробьинообразные",
        family = "Воробьиные",
        genus = "Воробьи",
        species = "Домовый воробей",
        adaptation = "Летающий"
    )
    bird.printInfo()

    // Создаем экземпляр класса Dog (коккер-спаниель)
    val dog = Dog(
        order = "Хищные",
        family = "Псовые",
        genus = "Псы",
        species = "Волк обыкновенный",
        adaptation = "Домашний питомец, помощь на охоте",
        subspecies = "",
        breed = "Кокер-спаниель"
    )
    dog.printInfo()

    val woolf = Dog(
        order = "Хищные",
        family = "Псовые",
        genus = "Псы",
        species = "Волк обыкновенный",
        adaptation = "Охота",
        subspecies = "Серый волк",
        breed = ""
    )
    woolf.printInfo()

    // Создаем экземпляр класса Cat (домашняя кошка)
    val cat = Cat(
        order = "Хищные",
        family = "Кошачьи",
        genus = "Кошки",
        species = "Кошка домашняя",
        adaptation = "Контроль популяции грызунов",
        subspecies = "",
        breed = "Домашняя кошка"
    )
    cat.printInfo()

    val tiger = Cat(
        order = "Хищные",
        family = "Кошачьи",
        genus = "Пантеры",
        species = "Тигр",
        adaptation = "Хищник",
        subspecies = "Бенгальский тигр",
        breed = ""
    )
   tiger.printInfo()
}

