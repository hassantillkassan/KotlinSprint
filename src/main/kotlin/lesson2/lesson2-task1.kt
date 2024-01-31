package lesson2

fun main() {
    val studentMark1 = 3f
    val studentMark2 = 4f
    val studentMark3 = 3f
    val studentMark4 = 5f

    val averageMark = (studentMark1 + studentMark2 + studentMark3 + studentMark4) / 4

    print(String.format("%.2f", averageMark))
}