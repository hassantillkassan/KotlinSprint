package lesson7

import kotlin.random.Random

fun main() {
    val pwChar: CharRange = 'a'.. 'z'

    var generatedPassword = ""
    val pwRange = 1.. 3

    for (i in pwRange) {
        generatedPassword += pwChar.random().toString()
        generatedPassword += Random.nextInt(0, 9)
    }

    println(generatedPassword)
}