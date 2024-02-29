package lesson_13

data class PhoneBook3(
    val name: String?,
    val phoneNumber: Long?,
    val company: String? = null,
)

fun main() {
    val numberOfContacts = 5
    val listOfContacts: MutableList<PhoneBook3> = mutableListOf()

    for (i in 1..numberOfContacts) {
        when (i) {
            1 -> listOfContacts.addLast(
                PhoneBook3(
                    generateRandomContactName(),
                    generateRandomPhoneNumber(),
                    "null"
                )
            )

            in (2..3) -> listOfContacts.addLast(
                PhoneBook3(
                    generateRandomContactName(),
                    generateRandomPhoneNumber(),
                    null
                )
            )

            else -> listOfContacts.addLast(
                PhoneBook3(
                    generateRandomContactName(),
                    generateRandomPhoneNumber(),
                    "Oriflame"
                )
            )
        }
    }

    val listOfExistingCompanies = listOfContacts.mapNotNull { it.company }.toSet()
    println(listOfExistingCompanies.joinToString())
}

fun generateRandomPhoneNumber(): Long {
    var number = String()
    repeat(6) { number += (0..9).random().toString() }

    val longNumber = number.toLong()
    return longNumber
}

fun generateRandomContactName(): String {
    val name = List((3..7).random()) { ('a'..'z').random() }
        .joinToString("").replaceFirstChar(Char::uppercase)
    return name
}