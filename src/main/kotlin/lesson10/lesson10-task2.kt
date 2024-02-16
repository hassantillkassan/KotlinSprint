package lesson10

fun main() {
    println("Придумайте логин и пароль, содержащие в себе хотя бы 4 символа")
    val enteredName = readln()
    val enteredPassword = readln()
    checkData(userName = enteredName, userPassword = enteredPassword)
}

fun checkData(userName: String?, userPassword: String?) {
    if ((userName!!.length < 4) or (userPassword!!.length < 4))
        println("Логин или пароль недостаточно длинные")
}