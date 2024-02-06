package lesson5

import kotlin.random.Random

fun main() {
    val guessedNumbers = List(3) { Random.nextInt(0, 42) }
    println("Загаданные числа: $guessedNumbers") // Служебный код для проверки

    print("Попробуйте угадать три числа от 0 до 42. Введите ваши числа через пробел: ")
    val (firstTry, secondTry, thirdTry) = readln()!!.split(" ")

    val guessingNumbers = listOf(
        firstTry.toInt(),
        secondTry.toInt(),
        thirdTry.toInt()
    )

    val intersectedList = guessedNumbers.intersect(guessingNumbers)
    val winningNumbers = intersectedList.size

    val gameResult = when (winningNumbers) {
        3 -> println("Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа. Так заберите ваш крупный приз!")
        1 -> println("Совпало всего одно число. Утешительный приз уже на вашей карточке")
        else -> println("Вы не угадали ни одного числа. На выход!")
    }

    println("$gameResult\nКстати, выигрышные числа были $guessedNumbers")
}