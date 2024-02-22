package lesson_11

class UserData2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    private var bio: String = String()
) {
    fun getUserData() {
        if (bio.isNotBlank())
            println(
                """
            |Информация о пользователе с id = $id
            |Логин: $login
            |Пароль: $password
            |Почта: $mail
            |О себе: $bio
        """.trimMargin()
            )
        else
            println(
                """
            |Информация о пользователе с id = $id
            |Логин: $login
            |Пароль: $password
            |Почта: $mail
        """.trimMargin()
            )
    }

    fun createBio() {
        print("Введите пару слов о себе: ")
        val enteredBio = readln()

        bio = enteredBio
    }

    fun changePassword() {
        print("Введите текущий пароль: ")
        var enteredPassword = readln()

        if (enteredPassword == password) {
            print("Введите новый пароль: ")
            enteredPassword = readln()

            password = enteredPassword
            println("Пароль успешно изменён")
        } else println("Неверный пароль!")
    }
}

fun main() {
    val user1 = UserData2(
        id = 1,
        login = "gleb11",
        password = "LoKtt254",
        mail = "glebasta2007@mail.ru",
    )

    user1.createBio()
    user1.changePassword()
    user1.getUserData()
}