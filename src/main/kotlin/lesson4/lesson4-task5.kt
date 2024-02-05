package lesson4

const val IS_DAMAGED = false
const val MIN_CREW_NUMBER = 55
const val RECOMMENDED_CREW_NUMBER = 70
const val MIN_NUMBER_OF_CRATE = 50
const val IS_WEATHER_FAVORABLE = true

fun main() {
    val isDamaged = false
    val crewNumber = 70
    val numberOfCrate = 55
    val isWeatherFavorable = true

    val sailingPrremit = (((isDamaged == IS_DAMAGED) and (crewNumber in MIN_CREW_NUMBER..RECOMMENDED_CREW_NUMBER) and (numberOfCrate >= MIN_NUMBER_OF_CRATE)) or ((isDamaged != IS_DAMAGED) and (crewNumber == RECOMMENDED_CREW_NUMBER) and (isWeatherFavorable == IS_WEATHER_FAVORABLE) and (numberOfCrate >= MIN_NUMBER_OF_CRATE)))
    println("Разрешение на отправку корабля в плавание: $sailingPrremit")
}