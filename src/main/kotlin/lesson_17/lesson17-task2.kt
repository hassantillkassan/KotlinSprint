package lesson_17

class Ship(
    name: String,
    var averageSpeed: Int,
    var homePort: String,
) {

    var name = name
        set(value: String) = println("Название корабля нельзя менять!")
}

fun main() {
    val ship1 = Ship(
        "Losharik",
        30,
        "Northern",
    )

    ship1.averageSpeed = 20
    ship1.name = "USS Gerald R. Ford"

    println(
        "Корабль ${ship1.name}: Его скорость - ${ship1.averageSpeed} узлов," +
                " порт приписки - ${ship1.homePort}"
    )
}