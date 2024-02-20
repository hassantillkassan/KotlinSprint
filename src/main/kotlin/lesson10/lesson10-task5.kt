package lesson10

import java.util.Base64

const val LOGIN = "johnny17"
const val PASSWORD = "MoNtana4u"
const val TOKEN_LENGTH = 32
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
    return if ((originalLogin == LOGIN) and (originalPassword == PASSWORD))
        generateToken()
    else
        null
}

fun generateToken(): String {
    val encodedLogin = Base64.getEncoder().encodeToString(LOGIN.toByteArray())
    val encodedPassword = Base64.getEncoder().encodeToString(PASSWORD.toByteArray())

    val charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    val signature = (1..(TOKEN_LENGTH - (encodedLogin.length + encodedPassword.length)))
        .map { charset.random() }
        .joinToString("")

    return """
        |$encodedLogin.
        |$encodedPassword.
        |$signature
    """.trimMargin()
}

fun getBasketContents(token: String): String {
    return LIST_OF_GOODS.joinToString(
        separator = ", ",
        postfix = "."
    ).replaceFirstChar(Char::uppercaseChar)
}