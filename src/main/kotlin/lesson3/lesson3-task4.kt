package lesson3

fun main() {
    var moveFrom = "E2"
    var moveWhere = "E4"
    var moveNumber = 1

    println("$moveFrom-$moveWhere:$moveNumber")

    moveFrom = "D2"
    moveWhere = "D3"

    println("$moveFrom-$moveWhere:${++moveNumber}")
}