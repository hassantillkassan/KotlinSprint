package lesson5

fun main() {
    val exampleValue1 = 7
    val exampleValue2 = 8
    val correctAnswer = exampleValue1 + exampleValue2

    print("Пройдите капчу: $exampleValue1 + $exampleValue2 = ")
    val captcha = readln().toInt()

    val programmeEntry = if (captcha == correctAnswer) "Добро пожаловать!"
    else "Доступ запрещён"

    println(programmeEntry)
}