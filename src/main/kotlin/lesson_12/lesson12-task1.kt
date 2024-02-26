package lesson_12

class WeatherTracking() {
    var dayTemperature: Int = 23
    var nightTemperature: Int = 11
    var dailyPrecipitation: Boolean = false

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
    val day1 = WeatherTracking()

    day1.dayTemperature = 32
    day1.nightTemperature = 15

    val day2 = WeatherTracking()

    day2.nightTemperature = 7
    day2.dailyPrecipitation = true

    day1.printWeatherByDay()
    day2.printWeatherByDay()
}