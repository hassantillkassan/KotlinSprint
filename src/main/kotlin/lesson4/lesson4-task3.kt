package lesson4

const val IS_SUNNY = true
const val IS_TENT_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "Не зима"

fun main() {
    val isSunny = true
    val isTentOpen = true
    val airHumidity = 20
    val timeOfYear = "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(isSunny == IS_SUNNY) and (isTentOpen == IS_TENT_OPEN) and (airHumidity == AIR_HUMIDITY) and (timeOfYear == SEASON)}")
}