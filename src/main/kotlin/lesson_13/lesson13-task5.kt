package lesson_13

data class PhoneBook5(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
)

fun main() {
    val contact: PhoneBook5

    println("Введите имя, номер телефона и компанию контакта")

    try {
        contact = PhoneBook5(
            readln(),
            readln().toLong(),
            readln(),
        )
    } catch (e: NumberFormatException) {
        println("Произошла ошибка: ${e::class.simpleName}")
    }
}