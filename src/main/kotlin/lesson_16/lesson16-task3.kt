package lesson_16

class User(
    val login: String,
) {

    private var password = String()

    fun runValidation(inputPassword: String): Boolean {
        password = "price07"
        return (inputPassword == password)
    }
}

fun main() {

    val user1 = User("Captain")

    println(user1.runValidation("price07"))
}