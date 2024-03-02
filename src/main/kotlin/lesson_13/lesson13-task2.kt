package lesson_13

class PhoneBook2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printContactDetails() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contact1 = PhoneBook2(
        name = "Vladik",
        phoneNumber = 322433,
    )

    val contact2 = PhoneBook2(
        name = "Peter",
        phoneNumber = 678909,
        company = "Oriflame",
    )

    contact1.printContactDetails()
    contact2.printContactDetails()
}