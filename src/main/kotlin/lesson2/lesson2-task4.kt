package lesson2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val  buff =  0.2f

    println("Количество бонусной кристаллической руды: " + (crystalOre * buff).toInt())
    println("Количество бонусной железной руды: " + (ironOre * buff).toInt())
}