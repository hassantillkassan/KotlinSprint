package org.example.lesson1

fun main () {
    val hourConst: UByte = 60U
    var seconds: UInt = 6480U
    val minutes: UInt = (seconds / hourConst)
    val hours = (minutes / hourConst)

    seconds %= hourConst
    print("0" + hours + ":" + (minutes - hourConst) + ":" + seconds + "0")
}