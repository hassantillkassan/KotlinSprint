package lesson_12

class WeatherTracking1(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val dailyPrecipitation: Boolean,
) {

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
    val day1 = WeatherTracking1(21, 6, false)

    day1.printWeatherByDay()
}