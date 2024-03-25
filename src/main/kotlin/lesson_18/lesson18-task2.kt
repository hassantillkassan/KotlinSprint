package lesson_18

open class Dice {

    open fun rollDice() = Unit

}

class FourSidedDice : Dice() {

    override fun rollDice() {
        println((1..4).random())
    }

}

class SixSidedDice : Dice() {

    override fun rollDice() {
        println((1..6).random())
    }

}

class EightSidedDice : Dice() {

    override fun rollDice() {
        println((1..8).random())
    }

}

fun main() {

    val dice1: Dice = FourSidedDice()
    val dice2: Dice = SixSidedDice()
    val dice3: Dice = EightSidedDice()

    val listOfDices = listOf<Dice>(dice1, dice2, dice3)

    showResultOfAllDiceRolls(listOfDices)

}

private fun showResultOfAllDiceRolls(dices: List<Dice>): List<Unit> {

    return dices.map { it.rollDice() }

}