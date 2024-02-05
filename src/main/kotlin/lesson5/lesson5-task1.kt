package lesson5

const val SIMPLE_EXAMPLE = "7 + 8"
const val SIMPLE_EXAMPLE_SOLUTION = 15

fun main() {
    print("Пройдите капчу: $SIMPLE_EXAMPLE = ")
    val captcha = readln().toInt()

    val programmeEntry = if (captcha == SIMPLE_EXAMPLE_SOLUTION) "Добро пожаловать!"
    else "Доступ запрещён"

    println(programmeEntry)
}