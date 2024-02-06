package lesson5

fun main() {
    val guessedNumber1 = 7
    val guessedNumber2 = 38

    print("Сможете угадать два числа от 0 до 42?\nВведите два числа через пробел: ")

    val (firstTry, secondTry) = readLine()!!.split(" ")

    val gameResult =
        if (((firstTry.toInt() == guessedNumber1) and (secondTry.toInt() == guessedNumber2)) or ((firstTry.toInt() == guessedNumber2) and (secondTry.toInt() == guessedNumber1))) "Поздравляем! Вы выиграли главный приз"
        else if ((firstTry.toInt() == guessedNumber1) or (firstTry.toInt() == guessedNumber2) or (secondTry.toInt() == guessedNumber1) or (secondTry.toInt() == guessedNumber2)) "Вы выиграли утешительный приз!"
        else "Неудача!"

    println("$gameResult\nЗагаданные числа были: $guessedNumber1 $guessedNumber2")
}