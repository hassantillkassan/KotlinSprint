package lesson6

fun main() {
    print("Добро пожаловать в Таймер! Сколько секунд вы хотите засечь: ")
    var secondsCounter = readln().toInt()

    var iterationCount = 0

    while (secondsCounter > 0) {
        println("Осталось ${secondsCounter--} сек")
        Thread.sleep(1000)
        iterationCount++
    }
    println("Прошло $iterationCount секунд")
}