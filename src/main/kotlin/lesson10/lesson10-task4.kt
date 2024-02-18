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
    var winCount = 0

    when {
        userValue > machineValue -> {
            println("Победило человечество")
            winCount++
        }

        userValue < machineValue -> println("Победила машина")
        else -> println("Победила ничья")
    }
    return winCount
}
