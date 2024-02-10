package lesson7

import kotlin.random.Random

fun main() {
    val pwChar: CharRange = 'a'..'z'
    val pwRange = 1..6

    var generatedPassword = ""


    for (i in pwRange) {
        if (i % 2 == 1) generatedPassword += pwChar.random()
        else generatedPassword += Random.nextInt(0, 9)
    }
    println(generatedPassword)
}