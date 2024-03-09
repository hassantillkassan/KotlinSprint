package lesson_14

open class LinerShip2(
    val name: String,
    val speed: Int = 500,
    val payload: Int = 300,
    val capacity: Int = 900,
) {

    open fun startLoading() {
        println("Горизонтальный трап выдвинут со шкафута")
    }

    open fun getPropertiesOfShip() {
        println(
            """
            |Название корабля: $name
            |Скорость: $speed
            |Грузоподъемность: $payload
            |Вместимость: $capacity
            |
        """.trimMargin()
        )
    }
}

class CargoShip2(
    name: String,
) : LinerShip2(name, speed = 300, payload = 700) {

    override fun startLoading() {
        println("Погрузочный кран активирован")
    }

    override fun getPropertiesOfShip() {
        println(
            """
            |Название корабля: $name
            |Скорость: $speed
            |Грузоподъемность: $payload
            |
        """.trimMargin()
        )
    }
}

class Icebreaker2(
    name: String,
    val isBreakingIce: Boolean = true,
) : LinerShip2(name, speed = 190, capacity = 500) {

    override fun startLoading() {
        println("Ворота со стороны кормы открыты")
    }

    override fun getPropertiesOfShip() {
        println(
            """
            |Название корабля: $name
            |Скорость: $speed
            |Вместимость: $capacity
            |Может колоть лёд: $isBreakingIce
        """.trimMargin()
        )
    }
}

fun main() {
    val liner2 = LinerShip2("liner2")
    val cargo2 = CargoShip2("cargo2")
    val icebreaker2 = Icebreaker2("icebreaker2")

    liner2.startLoading()
    cargo2.startLoading()
    icebreaker2.startLoading()

    println()

    liner2.getPropertiesOfShip()
    cargo2.getPropertiesOfShip()
    icebreaker2.getPropertiesOfShip()
}