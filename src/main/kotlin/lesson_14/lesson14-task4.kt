package lesson_14

abstract class CelestialBody(
    val name: String,
    val isAtmosphere: Boolean,
    val isSuitableForLanding: Boolean,
) {

}

class Planet(
    name: String,
    isAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
    val listOfSatellites: List<Satellite> = listOf(),
) : CelestialBody(name, isAtmosphere, isSuitableForLanding) {

}

class Satellite(
    name: String,
    isAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
) : CelestialBody(name, isAtmosphere, isSuitableForLanding) {

}


fun main() {
    val satellite1 = Satellite(
        "satellite1",
        false,
        false,
    )
    val satellite2 = Satellite(
        "satellite2",
        true,
        false,
    )

    val planet1 = Planet(
        "planet1",
        true,
        true,
        listOfSatellites = listOf(satellite1, satellite2),
    )

    println(
        "Название планеты: ${planet1.name}\n" +
                "Её спутники: ${planet1.listOfSatellites.joinToString(", ") { it.name }}"
    )
}