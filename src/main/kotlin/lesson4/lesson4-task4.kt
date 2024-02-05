package lesson4

fun main() {
    val dayOfTraining = 5
    val evenCheck = dayOfTraining % 2

    val trainingProgram = """
        |Упражнения для рук:    ${evenCheck !== 0}
        |Упражнения для ног:   ${evenCheck == 0}
        |Упражнения для спины: ${evenCheck == 0}
        |Упражнения для пресса: ${evenCheck != 0}
    """.trimMargin()
    println(trainingProgram)
}