package lesson_16

class Dice() {

    private val randomNumber = (1..6).random()

    fun getRandomNumber() {
        println(randomNumber)
    }

}

fun main() {

    val dice1 = Dice()
    dice1.getRandomNumber()
}