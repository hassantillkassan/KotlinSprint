package lesson10

private var winCount = 0

fun main() {
    var userTurn: Int
    var machineTurn: Int
    var userChoice: String

    do {
        userTurn = rollDice()
        machineTurn = rollDice()

        playRound(userTurn, machineTurn)

        print("Хотите бросить кости еще раз? Введите \"Да\" или \"Нет\": ")
        userChoice = readln()
    } while (userChoice.equals("Да", ignoreCase = true))

    println("Игра окончена. Вы одержали победу в $winCount партиях")
}

private fun rollDice(): Int = (1..6).random()

private fun playRound(userValue: Int, machineValue: Int) {
    when {
        userValue > machineValue -> {
            println("Победило человечество")
            winCount++
        }

        userValue < machineValue -> println("Победила машина")
        else -> println("Победила ничья")
    }
}