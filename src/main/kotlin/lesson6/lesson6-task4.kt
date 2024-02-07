package lesson6

fun main() {
    val guessedNumber = ((Math.random() * 9) + 1).toInt()
    println(guessedNumber)

    print("У вас есть пять попыток, чтобы угадать число в промежутке от 1 до 9. Введите число: ")
    var enteredNumber = readln().toInt()

    var numberOfAttempts = 5

    while ((numberOfAttempts > 1) and (guessedNumber != enteredNumber)) {
        print("Неверно! Осталось попыток: ${--numberOfAttempts}\nВведите число: ")
        enteredNumber = readln().toInt()
    }
    if (enteredNumber == guessedNumber) println("Это была великолепная игра!")
    else println("Было загадано число: $guessedNumber")
}