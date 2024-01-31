package lesson2

fun main() {
    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val travelTime = 457

    var hourOfArrival = travelTime / 60 + hourOfDeparture
    var minuteOfArrival: Int

    if ((travelTime % 60) < (60 - minuteOfDeparture)) {
        minuteOfArrival = travelTime % 60 + minuteOfDeparture
    } else {
        hourOfArrival++
        minuteOfArrival = (travelTime + minuteOfDeparture) % 60
    }


    println(String.format("%02d:%02d", hourOfArrival, minuteOfArrival))
}