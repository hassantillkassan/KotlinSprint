package lesson7

fun main() {
    print("Введите число, до которого хотите получить чётные числа: ")
    val enteredNumber = readln().toInt()

    val evenNumberRange = 0..enteredNumber step 2

    for (i in evenNumberRange) {
        if (i == 0) continue
        println(i)
    }
}