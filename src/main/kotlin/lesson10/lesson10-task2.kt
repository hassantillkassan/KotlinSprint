package lesson10

fun main() {
    println("Придумайте логин и пароль, содержащие в себе хотя бы 4 символа")
    val enteredName = readln()
    val enteredPassword = readln()

    if (!checkData(enteredName) or !checkData(enteredPassword))
        println("Логин или пароль недостаточно длинные")
}

fun checkData(userData: String?): Boolean = userData!!.length >= 4