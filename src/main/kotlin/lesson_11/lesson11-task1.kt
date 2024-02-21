package lesson_11

class UserData(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
) {}

fun main() {
    val user1 = UserData(
        id = 1,
        login = "gleb11",
        password = "LoKtt254",
        mail = "glebasta2007@mail.ru"
    )

    val user2 = UserData(
        id = 2,
        login = "barMen4ik77",
        password = "abrauDURSO23",
        mail = "shaker-shakeRR_@yandex.ru",
    )

    println("""
        |Вот, что известно о пользователе с id = ${user1.id}
        |Его логин: ${user1.login}
        |Его почта: ${user1.mail.subSequence(0..4)}***@${user1.mail.substringAfterLast("@")}
        |
    """.trimMargin())

    println("""
        |Вот, что известно о пользователе с id = ${user2.id}
        |Его логин: ${user2.login}
        |Его почта: ${(user2.mail).subSequence(0..4)}***@${user2.mail.substringAfterLast("@")}
    """.trimMargin())
}