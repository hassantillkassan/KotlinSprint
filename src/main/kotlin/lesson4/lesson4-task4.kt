package lesson4

fun main() {
    val dayOfTraining = 4
    val evenCheck = dayOfTraining % 2

    val trainingProgram = """
        |Упражнения для рук: ${String.format("%8s", evenCheck != 0)}
        |Упражнения для ног: ${String.format("%8s", evenCheck == 0)}
        |Упражнения для спины: ${String.format("%6s", evenCheck == 0)}
        |Упражнения для пресса: ${String.format("%5s", evenCheck != 0)}
    """.trimMargin()
    println(trainingProgram)
}