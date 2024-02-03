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

    println(String.format("%3d %8d", 488, 488))
    println(String.format("%3d %8d", 489, 44499))
    println(String.format("%3d %8d", 490, 70070))
}