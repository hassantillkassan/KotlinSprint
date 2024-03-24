package lesson_18

class CRM {

    fun getOrderInformation(
        orderNumber: Int,
        items: String,
    ) {
        println("Заказан товар: $items")
    }

    fun getOrderInformation(
        orderNumber: Int,
        items: List<String>,
    ) {
        println("Заказаны следующие товары: ${items.joinToString(", ")}")
    }

}

fun main() {

    val crm = CRM()

    crm.getOrderInformation(
        2372,
        "iPhone 14 512Gb",
    )
    println()

    crm.getOrderInformation(
        2391,
        listOf("AirPods Pro", "Silicon Case Abyss Blue", "Google Pixel 8 Pro 256Gb+12Gb"),
    )

}