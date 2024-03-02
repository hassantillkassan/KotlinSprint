package lesson_13

class PhoneBook4(
    val name: String,
    val phoneNumber: Long?,
    val company: String? = null
) {
    fun printAllContacts(list: MutableList<PhoneBook4>) {
        var counter = 0
        list.forEach {
            println(
                """
            |Контакт ${++counter}
            |Имя: ${it.name}
            |Номер телефона: ${it.phoneNumber}
            |Название компании: ${it.company}
            |
        """.trimMargin()
            )
        }
    }
}

fun main() {
    val listOfContacts: MutableList<PhoneBook4> = mutableListOf()

    var enteredValueToContinue = "да"
    var contact: PhoneBook4

    do {
        println("Введите имя, номер телефона и компанию контакта (через Enter)")
        contact = PhoneBook4(
            readln(),
            readln().toLongOrNull(),
            readln().ifBlank { null },
        )

        if (contact.phoneNumber == null) {
            println("Неверный формат номера телефона. Контакт не добавлен.")
            continue
        }
        listOfContacts.add(contact)

        println("Хотите создать ещё один контакт? Введите - да или нет: ")
        enteredValueToContinue = readln()
    } while (enteredValueToContinue.equals("да", ignoreCase = true))

    contact.printAllContacts(listOfContacts)

}