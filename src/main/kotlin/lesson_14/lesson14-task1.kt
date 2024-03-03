package lesson_14

open class LinerShip(
    val name: String,
    val speed: Int = 500,
    val payload: Int = 300,
    val capacity: Int = 900,
)

class CargoShip(
    name: String,
) : LinerShip(name, speed = 300, payload = 700)

class Icebreaker(
    name: String,
    val isBreakingIce: Boolean = true,
) : LinerShip(name, speed = 190, capacity = 500)

fun main() {
    val liner1 = LinerShip("liner1")
    val cargo1 = CargoShip("cargo1")
    val icebreaker1 = Icebreaker("icebreaker1")
}