package lesson6

fun main() {
    print("Создайте логин: ")
    val userLogin = readln()

    print("Создайте пароль: ")
    val userPassword = readln()

    print("Авторизируйтесь, используя логин и пароль через пробел: ")
    var (enteredLogin, enteredPassword) = readln().split(" ")

    while ((userLogin != enteredLogin) or (userPassword != enteredPassword)) {
        print("Неверный логин или пароль!\nВведите логин: ")
        enteredLogin = readln()
        print("Введите пароль: ")
        enteredPassword = readln()
    }
    println("Авторизация прошла успешно")
}