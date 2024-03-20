package lesson_16

class Order(
    private val number: Int = (1..100).random(),
    private var readyStatus: String = "Prepared",
) {


    private fun changeOrderStatus(newStatus: String) {
        readyStatus = newStatus
        println("Статус готовности заказа номер $number обновлён на $readyStatus")
    }

    fun contactManager(inputStatus: String) {
        return changeOrderStatus(inputStatus)
    }
}

fun main() {

    val order1 = Order()
    order1.contactManager("Ready")
}