package lesson2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    var  buff: Float =  20f

    buff /= 100

    println("Количество бонусной кристаллической руды: " + (crystalOre * buff).toInt())
    println("Количество бонусной железной руды: " + (ironOre * buff).toInt())
}