package lesson_16

class User() {

    val login = "Captain"
    private val password = "price07"

    fun runValidation(inputData: String): Boolean {
        val splitedLine = inputData.split(" ")

        return if (login.equals(splitedLine[0]))
            password.equals(splitedLine[1])
        else false

    }

    init {
        println(
            "Для запуска валидации воспользуйтесь методом \"runValidation()\"\n" +
                    "Логин и парроль вводите через пробел\n"
        )
    }
}

fun main() {

    val user1 = User()

    println(user1.runValidation("${user1.login} price07"))
}