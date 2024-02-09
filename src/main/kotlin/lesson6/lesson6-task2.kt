package lesson6

import java.util.concurrent.TimeUnit

fun main() {
    print("Добро пожаловать в Простой Таймер! Сколько секунд вы хотите засечь: ")
    val secondsCounter = readln().toLong()

    TimeUnit.SECONDS.sleep(secondsCounter)

    println("Прошло $secondsCounter секунд")
}