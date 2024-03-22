package lesson_17

class Parcel(
    val parcelNumber: Int,
    currentLocation: String,
) {

    var tripCounter = 0
    var currentLocation = currentLocation
        set(value) {
            field = value
            println("Посылка номер $parcelNumber: Количество перемещений - ${++tripCounter}")
        }
}

fun main() {
    val parcel1 = Parcel(
        32,
        "На складе",
    )

    parcel1.currentLocation = "В пути"
    println(parcel1.currentLocation)

    parcel1.currentLocation = "На промежуточном складе"
    println(parcel1.currentLocation)

    parcel1.currentLocation = "Доставлена"
    println(parcel1.currentLocation)
}