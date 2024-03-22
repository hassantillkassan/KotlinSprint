package lesson_17

class User(
    login: String,
    password: String,
) {

    var login = login
        set(value) {
            field = value
            println("Логин успешно изменён на $value")
        }

    var password = password
        get() = repeat(field.length) { print("*") }.toString()
        set(value) = println("Вы не можете изменить пароль")

}

fun main() {
    val user1 = User(
        "dungeon",
        "master77",
    )
    user1.password
    user1.password = "gym678"
    user1.login = "billyH"
}