package lesson_13

data class PhoneBook5(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
)

fun main() {
    val invalidCharset = (' '..'/') + ('A'..'Z') + ('a'..'z')
    val contact: PhoneBook5

    println("Введите номер телефона контакта, который хотите создать")
    val enteredNumber = readln()


    invalidCharset.forEach{
        if (enteredNumber.contains(it)) {
            println(
                "Ошибка: \"NumberFormatException\"\n" +
                        "Ваш номер телефона содержит недопустимые символы"
            )
            return
        }

    }

    println("Введите имя и компанию контакта")
    contact = PhoneBook5(
        readln(),
        enteredNumber.toLong(),
        readln(),
    )
}