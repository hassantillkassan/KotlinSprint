package lesson_13

data class PhoneBook(
    val name: String?,
    val phoneNumber: Long?,
    val company: String?,
)

fun main() {
    val contact1 = PhoneBook(
        name = "Vladik",
        phoneNumber = 376844,
        company = null,
    )

    println(contact1.company)
}