package lesson10

fun main() {
    print("Введите длину пароля, который хотите сгенерировать: ")
    val enteredPassLength = readln().toInt()

    generatePassword(passLength = enteredPassLength)
}

fun generatePassword(passLength: Int) {
    val charset = ' '..'/'
    val numset = 0..9

    var generatedPassword = String()

    for (i in 1..passLength) {
        generatedPassword += numset.random()
        generatedPassword += charset.random()
    }
    println("Ваш пароль: $generatedPassword")
}