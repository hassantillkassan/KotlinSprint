package lesson_12

class WeatherTracking1(
    var dayTemperature: Int? = null,
    var nightTemperature: Int? = null,
    var dailyPrecipitation: Boolean? = null,
) {
    fun printWeatherByDay() {
        if (dayTemperature != null) println("Температура днём: $dayTemperature")
        if (nightTemperature != null) println("Температура ночью: $nightTemperature")
        if (dailyPrecipitation != null) println("Наличие осадков в течение суток: $dailyPrecipitation")
    }
}

fun main() {
    val day1 = WeatherTracking1(
        nightTemperature = 9,
    )

    day1.printWeatherByDay()
}