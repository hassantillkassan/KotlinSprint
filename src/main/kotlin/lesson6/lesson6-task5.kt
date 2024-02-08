package lesson6

import kotlin.random.Random

fun main() {
    var exampleNumber1 = Random.nextInt(1, 9)
    var exampleNumber2 = Random.nextInt(1, 9)

    print("Подтвердите, что вы не бот!\nРешите пример: $exampleNumber1 + $exampleNumber2 = ")
    var userAnswer = readln().toInt()

    var numberOfAttempts = 3

    while ((userAnswer != (exampleNumber1 + exampleNumber2)) and (numberOfAttempts > 1)) {
        exampleNumber1 = Random.nextInt(1, 9)
        exampleNumber2 = Random.nextInt(1, 9)
        print(
            "Неверно! Количество оставшихся попыток: ${--numberOfAttempts}" +
                    "\nРешите пример: $exampleNumber1 + $exampleNumber2 = "
        )
        userAnswer = readln().toInt()
    }
    if (userAnswer == (exampleNumber1 + exampleNumber2)) println("Добро пожаловать!")
    else println("Доступ запрещен")
}