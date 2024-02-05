package lesson5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2024
fun main() {
    print("Введите год рождения: ")
    val yearOfBirth = readln().toInt()

    val programmeEntry = if ((CURRENT_YEAR - yearOfBirth) >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else "Вернуться на главный экран"

    println(programmeEntry)
}