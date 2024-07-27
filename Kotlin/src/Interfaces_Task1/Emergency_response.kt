package Interfaces_Task1

class Emergency_response(
    name: String,
    phoneNumber: String
) :
    Service(name, phoneNumber),
    description {

    var action = ""

    override fun activity() {
        println(action)
    }

    override fun getDescription() {
        println(name)
        println("Тел: $phoneNumber")
    }
}