package lesson10

fun main() {
    val userTurn = rollDice()
    val machineTurn = rollDice()

    if (userTurn > machineTurn) println("Победило человечество")
    else if (userTurn == machineTurn) println("Победила ничья")
    else println("Победила машина")
}

fun rollDice(): Int = (1..6).random()