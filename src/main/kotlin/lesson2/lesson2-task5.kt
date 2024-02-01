package lesson2

import kotlin.math.pow

fun main() {
    val investment = 70000
    val interestRate = 1.167
    val depositPeriod = 20

    print(String.format("%.3f", investment * (interestRate).pow(depositPeriod)))

}