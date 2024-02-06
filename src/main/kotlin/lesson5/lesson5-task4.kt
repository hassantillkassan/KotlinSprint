package lesson5

const val REGISTERED_USER_NAME = "Zaphod"
const val REGISTERED_USER_PASSWORD = "PanGalactic"

fun main() {
    val welcomeMessage = """
        |Внимание, пассажир. Моя обязанность, как обычно, незавидная,
        |- приветствовать вас на борту корабля "Heart of Gold".
        |[вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя,
        |чтобы мы могли приступить к процессу входа. Я всегда готов
        |служить, хотя это не приносит мне радости... но вы, наверное, об
        |этом не заботитесь. [вздыхает ещё глубже...] Да, вперед,
        |пожалуйста, вводите свои данные... 
    """.trimMargin()
    val spaceshipControlAccess = """
        |[вздыхает...] Ваши данные проверены, и о, чудо, они верны.
        |Пользователь "$REGISTERED_USER_NAME", вам разрешено входить на борт
        |корабля "Heart of Gold". Хотя мне всё равно... Ну вперед,
        |войдите... Если вам так уж надо, в конце концов...
        |[меланхолический вздох...] Надеюсь, вам понравится
        |пребывание здесь больше, чем мне.
    """.trimMargin()

    println(welcomeMessage)
    val userName = readln()

    if (userName == REGISTERED_USER_NAME) {
        print("Введите пароль: ")
        val userPassword = readln()
        if (userPassword == REGISTERED_USER_PASSWORD) println(spaceshipControlAccess)
        else println("Неверный пароль!")
    } else println("Прежде, чем получить доступ к управлению кораблём - зарегистрируйтесь!")
}