package lesson_18

abstract class Dice(private val numberOfSides: Int) {

    open fun rollDice() {
        println((1..numberOfSides).random())
    }

}

class FourSidedDice(numberOfSides: Int = 4) : Dice(numberOfSides) {

    override fun rollDice() {
        super.rollDice()
    }

}

class SixSidedDice(numberOfSides: Int = 6) : Dice(numberOfSides) {

    override fun rollDice() {
        super.rollDice()
    }

}

class EightSidedDice(numberOfSides: Int = 8) : Dice(numberOfSides) {

    override fun rollDice() {
        super.rollDice()
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