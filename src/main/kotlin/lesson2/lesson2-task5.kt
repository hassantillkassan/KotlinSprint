package lesson2

import kotlin.math.pow

fun main() {
    val investment = 70000
    val depositPeriod = 20
    var interestRate = 16.7

    interestRate /= 100


    print(String.format("%.3f", investment * (++interestRate).pow(depositPeriod)))

}