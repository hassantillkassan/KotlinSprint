package lesson_11

const val ABSOLUTE_ZERO = -273

class WeatherTracking2(
    _dayTemperature: Int,
    _nightTemperature: Int,
    _dailyPrecipitation: Boolean,
) {
    val dayTemperature = _dayTemperature + ABSOLUTE_ZERO
    val nightTemperature = _nightTemperature + ABSOLUTE_ZERO
    val dailyPrecipitation = _dailyPrecipitation

    fun printWeatherByDay() {
        println(
            """
                |Температура днём (в Цельсиях): $dayTemperature
                |Температура ночью (в Цельсиях): $nightTemperature
                |Наличие осадков в течение суток: $dailyPrecipitation
            """.trimMargin()
        )
    }
}

fun main() {
    val day1 = WeatherTracking2(294, 287, false)

    day1.printWeatherByDay()
}