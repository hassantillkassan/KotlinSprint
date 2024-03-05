package lesson_14

open class LinerShip2(
    val name: String,
    val speed: Int = 500,
    val payload: Int = 300,
    val capacity: Int = 900,
) {
    fun sideOutGangway() {
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

    fun activateLoadingCrane() {
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

    fun openGates() {
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

    liner2.sideOutGangway()
    cargo2.activateLoadingCrane()
    icebreaker2.openGates()

    println()

    liner2.getPropertiesOfShip()
    cargo2.getPropertiesOfShip()
    icebreaker2.getPropertiesOfShip()
}