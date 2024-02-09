package lesson7

fun main() {
    print("Введите количество секунд, которое хотите засечь: ")
    val enteredSeconds = readln().toInt()

    val secRange = enteredSeconds downTo 0

    for (i in secRange) {
        if (i == 0) continue
        println("Осталось $i сек")
        Thread.sleep(1000)
    }
    println("Время вышло")
}