package lesson7

import kotlin.random.Random

fun main() {
    do {
        val smsCode = Random.nextInt(1000, 9999)
        println("Ваш код авторизации $smsCode")

        print("Введите код, чтобы авторизироваться: ")
        val enteredCode = readln().toInt()
    } while (enteredCode != smsCode)

    println("Добро пожаловать!")
}