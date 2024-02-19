package lesson10

import java.util.Base64

const val LOGIN = "johnny17"
const val PASSWORD = "MoNtana4u"
val LIST_OF_GOODS = listOf("помидоры", "молоко", "хлеб", "вода", "тимьян")

fun main() {
    println("Введите логин и пароль:")
    val enteredLogin = readln()
    val enteredPassword = readln()

    val receivedToken = authoriseUser(enteredLogin, enteredPassword)

    if (receivedToken == null) println("Ошибка авторизации")
    else println("Содержимое вашей корзины: ${getBasketContents(receivedToken)}")
}

fun authoriseUser(originalLogin: String, originalPassword: String): String? {
    val encodedLogin: String
    val encodedPassword: String
    val signature: String

    val charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')

    if ((originalLogin == LOGIN) and (originalPassword == PASSWORD)) {
        encodedLogin = Base64.getEncoder().encodeToString(originalLogin.toByteArray())
        encodedPassword = Base64.getEncoder().encodeToString(originalPassword.toByteArray())

        signature = (1..(32 - (encodedLogin.length + encodedPassword.length)))
            .map { charset.random() }
            .joinToString("")

        return """
            |$encodedLogin.
            |$encodedPassword.
            |$signature
        """.trimMargin()
    } else return null
}

fun getBasketContents(token: String): String {
    return LIST_OF_GOODS.joinToString(
        separator = ", ",
        postfix = "."
    ).replaceFirstChar(Char::uppercaseChar)
}