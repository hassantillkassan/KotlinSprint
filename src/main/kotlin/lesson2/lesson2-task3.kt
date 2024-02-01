package lesson2

const val BASIS_TIME = 60

fun main() {
    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val travelTime = 457

    var minuteOfArrival = minuteOfDeparture + travelTime
    val hourOfArrival = hourOfDeparture + minuteOfArrival / BASIS_TIME
    minuteOfArrival %= BASIS_TIME

    println(String.format("%02d:%02d", hourOfArrival, minuteOfArrival))
}