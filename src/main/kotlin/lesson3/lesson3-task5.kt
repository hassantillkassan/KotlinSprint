package lesson3

fun main() {
    val strInput = "D2-D4;0"

    val moveFrom = strInput.substringBefore("-")
    val moveWhere = strInput.substring(3,5)
    val moveNumber = strInput.substringAfter(";")

    println(moveFrom)
    println(moveWhere)
    println(moveNumber)
}