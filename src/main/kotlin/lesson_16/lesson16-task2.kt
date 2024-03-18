package lesson_16

import kotlin.math.pow

private const val PI = 3.14

class Circle(
    private val radius: Double,
) {

    fun getCircleLength() = String.format("%.2f", (2 * PI * radius))
    fun getCircleArea() = String.format("%.2f", (PI * radius.pow(2.0)))
}

fun main() {

    val circle1 = Circle(4.2)

    println(circle1.getCircleLength())
    println(circle1.getCircleArea())
}