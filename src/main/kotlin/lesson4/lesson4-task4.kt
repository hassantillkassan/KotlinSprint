package lesson4

fun main() {
    val dayOfTraining = 5
    val evenCheck = dayOfTraining % 2 == 0

    val trainingProgram = """
        Упражнения для рук:    ${!evenCheck}
        Упражнения для ног:    $evenCheck
        Упражнения для спины:  $evenCheck
        Упражнения для пресса:  ${!evenCheck}
    """.trimIndent()

    println(trainingProgram)
}