package lesson7

import kotlin.random.Random

fun main() {
    var smsCode = Random.nextInt(1000, 9999)
    println("Ваш код авторизации $smsCode")

    print("Введите код, чтобы авторизироваться: ")
    var enteredCode = readln().toInt()

    while (enteredCode != smsCode) {
        smsCode = Random.nextInt(1000, 9999)
        println("Ваш код авторизации $smsCode")

        print("Введите код, чтобы авторизироваться: ")
        enteredCode = readln().toInt()
    }
    println("Добро пожаловать!")
}