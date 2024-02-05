package lesson4

const val NUMBER_OF_TABLES = 13

fun main() {
    val reservationToday = 13
    val reservationTomorrow = 9

    println("Доступность столиков на сегодня: ${reservationToday < NUMBER_OF_TABLES}")
    println("Доступность столиков на завтра: ${reservationTomorrow < NUMBER_OF_TABLES}")
}