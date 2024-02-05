package lesson4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {
    val freightWeight1 = 20
    val freightVolume1 = 80
    val freightWeight2 = 50
    val freightVolume2 = 100

    println("Груз с весом $freightWeight1 и объёмом $freightVolume1 соответствует категории \'Average\': ${(freightWeight1 > MIN_WEIGHT) and (freightWeight1 <= MAX_WEIGHT) and (freightVolume1 < MAX_VOLUME)}")
    println("Груз с весом $freightWeight2 и объёмом $freightVolume2 соответствует категории \'Average\': ${(freightWeight2 > MIN_WEIGHT) and (freightWeight2 <= MAX_WEIGHT) and (freightVolume2 < MAX_VOLUME)}")
}