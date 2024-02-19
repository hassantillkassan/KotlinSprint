package lesson10

fun main() {
    var userTurn: Int
    var machineTurn: Int
    var userChoice: String
    var gameResult = 0

    do {
        userTurn = rollDice()
        machineTurn = rollDice()

        gameResult += playRound(userTurn, machineTurn)

        print("Хотите бросить кости еще раз? Введите \"Да\" или \"Нет\": ")
        userChoice = readln()
    } while (userChoice.equals("Да", ignoreCase = true))

    println("Игра окончена. Вы одержали победу в $gameResult партиях")
}

private fun rollDice(): Int = (1..6).random()

private fun playRound(userValue: Int, machineValue: Int): Int {
    when {
        userValue > machineValue -> {
            println("Победило человечество")
            return 1
        }

        userValue < machineValue -> println("Победила машина")
        else -> println("Победила ничья")
    }
    return 0
}
