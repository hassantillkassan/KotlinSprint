package org.example.lesson1

fun main () {
    val BASIS_TIME: Byte = 60
    var seconds: Int = 6480
    var minutes: Int = (seconds / BASIS_TIME)
    val hours = (minutes / BASIS_TIME)

    seconds %= BASIS_TIME
    minutes %= BASIS_TIME

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}