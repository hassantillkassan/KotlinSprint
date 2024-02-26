package lesson_12

class WeatherTracking1(
    _dayTemperature: Int,
    _nightTemperature: Int,
    _dailyPrecipitation: Boolean,
) {
    val dayTemperature = _dayTemperature
    val nightTemperature = _nightTemperature
    val dailyPrecipitation = _dailyPrecipitation

    fun printWeatherByDay() {
        println(
            """
                |Температура днём: $dayTemperature
                |Температура ночью: $nightTemperature
                |Наличие осадков в течение суток: $dailyPrecipitation
            """.trimMargin()
        )
    }
}

fun main() {
    val day1 = WeatherTracking1(21, 10, false)

    day1.printWeatherByDay()
}