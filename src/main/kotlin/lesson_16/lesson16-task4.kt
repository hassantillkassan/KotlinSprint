package lesson_16

class Order {

    private val number = (1..100).random()
    private var isReady = false

    private fun changeOrderStatus(newStatus: Boolean) {
        isReady = newStatus
        println("Статус готовности заказа номер $number обновлён на $isReady")
    }

    fun contactManager(inputStatus: Boolean): Boolean {
        return inputStatus.also {
            changeOrderStatus(it)
        }
    }
}

fun main() {

    val order1 = Order()

    order1.contactManager(true)
}