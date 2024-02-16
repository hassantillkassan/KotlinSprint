package lesson10

fun main() {
    print("Введите длину пароля, который хотите сгенерировать: ")
    val enteredPassLength = readln().toInt()

    generatePassword(passLength = enteredPassLength)
}

fun generatePassword(passLength: Int) {
    val charset = listOf(
        '!', '"', '#', '$', '%',
        '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ' '
    )
    val numset = 0..9

    val passRange = 1..passLength
    var generatedPassword = String()

    for (i in passRange) {
        generatedPassword += numset.random()
        generatedPassword += charset.random()
    }
    println("Ваш пароль: $generatedPassword")
}