package lesson3

fun main() {
    val tableValue = 7
    val multiplicationTable = """
        |$tableValue * 1 = ${tableValue * 1}
        |$tableValue * 2 = ${tableValue * 2}
        |$tableValue * 3 = ${tableValue * 3}
        |$tableValue * 4 = ${tableValue * 4}
        |$tableValue * 5 = ${tableValue * 5}
        |$tableValue * 6 = ${tableValue * 6}
        |$tableValue * 7 = ${tableValue * 7}
        |$tableValue * 8 = ${tableValue * 8}
        |$tableValue * 9 = ${tableValue * 9}
    """.trimMargin()

    println(multiplicationTable)

}