package lesson2

import kotlin.math.pow

fun main() {
    val investment = 70000
    val depositPeriod = 20
    val interestRate = 16.7

    var coeff = interestRate / 100


    print(String.format("%.3f", investment * (++coeff).pow(depositPeriod)))

}