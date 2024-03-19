package lesson_15

abstract class WeatherStationStats {

    abstract val dailyReadings: Int

}

class Temperature(override val dailyReadings: Int) : WeatherStationStats()

class PrecipitationAmount(override val dailyReadings: Int) : WeatherStationStats()

class WeatherServer {

    fun sendMessage(temperature: Temperature, precipitationAmount: PrecipitationAmount) {
        println(
            """
            |Температура: ${temperature.dailyReadings}
            |Количество осадков: ${precipitationAmount.dailyReadings} мм.
            |Данные успешно отправлены на ${WeatherServer::class.simpleName}
        """.trimMargin()
        )
    }

}

fun main() {
    val server = WeatherServer()

    val dailyTemperature1 = Temperature(20)
    val dailyPrecipitation1 = PrecipitationAmount(5)

    server.sendMessage(dailyTemperature1, dailyPrecipitation1)

}