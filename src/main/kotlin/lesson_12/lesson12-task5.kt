package lesson_12

import kotlin.random.Random

private const val ABSOLUTE_ZERO = -273

class WeatherTracking4(
    _dayTemperature: Int,
    _nightTemperature: Int,
    _dailyPrecipitation: Boolean,
) {
    val dayTemperature = _dayTemperature + ABSOLUTE_ZERO
    val nightTemperature = _nightTemperature + ABSOLUTE_ZERO
    val dailyPrecipitation = _dailyPrecipitation
}

fun main() {
    val listOfDays: MutableList<WeatherTracking4> = mutableListOf()

    val listOfDayTemperature: MutableList<Int> = mutableListOf()
    val listOfNightTemperature: MutableList<Int> = mutableListOf()
    val listOfDailyPrecipitation: MutableList<Boolean> = mutableListOf()

    repeat(30) {
        listOfDays.add(
            WeatherTracking4(
                (283..303).random(),
                (273..293).random(),
                Random.nextBoolean()
            )
        )
    }

    listOfDays.forEach() {
        listOfDayTemperature.add(it.dayTemperature)
        listOfNightTemperature.add(it.nightTemperature)
        listOfDailyPrecipitation.add(it.dailyPrecipitation)
    }

    val averageTemps = (listOfDayTemperature.average() + listOfNightTemperature.average()) / 2

    val numberOfPrecipitationDays = listOfDailyPrecipitation.filter { it }.size

    println(
        "Среднее значение температур в течение суток: ${String.format("%.2f", averageTemps)}\n" +
                "Количество дней с осадками: $numberOfPrecipitationDays"
    )
}