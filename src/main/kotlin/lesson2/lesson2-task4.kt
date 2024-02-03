package lesson2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val  buff =  20f

    val coeff = buff / 100

    println("Количество бонусной кристаллической руды: " + (crystalOre * coeff).toInt())
    println("Количество бонусной железной руды: " + (ironOre * coeff).toInt())
}