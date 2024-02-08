package lesson6

fun main() {
    print("Добро пожаловать в Таймер! Сколько секунд вы хотите засечь: ")
    var secondsCounter = readln().toInt()

    while (secondsCounter > 0) {
        println("Осталось секунд ${secondsCounter--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}