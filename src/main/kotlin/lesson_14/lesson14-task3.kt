package lesson_14

import kotlin.math.PI
import kotlin.math.pow

abstract class Figure(
    val color: String,
) {

    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {

    override fun calculateArea(): Double {
        return radius.pow(2.0) * PI
    }

    override fun calculatePerimeter(): Double {
        return 2 * radius * PI
    }
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {

    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return (width + height) * 2
    }
}

fun main() {


    val circle1 = Circle(
        "white",
        3.5,
    )
    val circle2 = Circle(
        "black",
        2.0,
    )
    val circle3 = Circle(
        "white",
        5.7,
    )

    val rectangle1 = Rectangle(
        "white",
        3.5,
        2.7,
    )
    val rectangle2 = Rectangle(
        "black",
        4.4,
        3.0
    )

    val listOfFigures: MutableList<Figure> = mutableListOf(
        circle1,
        circle2,
        circle3,
        rectangle1,
        rectangle2
    )

    var sumOfAreas = 0.0
    var sumOfPerimeters = 0.0

    listOfFigures.forEach {
        if (it.color == "white")
            sumOfAreas += it.calculateArea()
        else
            sumOfPerimeters += it.calculatePerimeter()
    }

    println(
        "Сумма площадей всех белых фигур: ${String.format("%.2f", sumOfAreas)}\n" +
                "Сумма периметров всех черных фигур: ${String.format("%.2f", sumOfPerimeters)}"
    )
}