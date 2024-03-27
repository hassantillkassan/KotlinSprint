package lesson_18

import kotlin.math.pow

abstract class Package {

    abstract fun getSurfaceArea(): Double

}

class RectangularPackage(
    private val length: Double,
    private val width: Double,
    private val height: Double,
) : Package() {

    override fun getSurfaceArea(): Double {
        return 2 * (length * width + width * height + length * height)
    }

}

class CubePackage(
    private val height: Double,
) : Package() {

    override fun getSurfaceArea(): Double {
        return 6 * height.pow(2.0)
    }

}

fun main() {

    val package1 = RectangularPackage(
        2.3,
        4.5,
        6.0,
    )

    val package2 = CubePackage(3.3)

    println("%.1f".format(package1.getSurfaceArea()))
    println("%.1f".format(package2.getSurfaceArea()))

}