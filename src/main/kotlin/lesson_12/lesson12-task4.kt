package lesson_12

const val ABSOLUTE_ZERO = -273

class WeatherTracking2(
    _dayTemperature: Int,
    _nightTemperature: Int,
    _dailyPrecipitation: Boolean,
) {
    val dayTemperature = _dayTemperature
    val nightTemperature = _nightTemperature
    val dailyPrecipitation = _dailyPrecipitation

    init {
        println(
            """
                |Температура днём (в Цельсиях): ${dayTemperature + ABSOLUTE_ZERO}
                |Температура ночью (в Цельсиях): ${nightTemperature + ABSOLUTE_ZERO}
                |Наличие осадков в течение суток: $dailyPrecipitation
            """.trimMargin()
        )
    }
}

fun main() {
    val day1 = WeatherTracking2(294, 287, false)
}