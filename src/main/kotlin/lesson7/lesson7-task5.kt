package lesson7

const val MIN_PW_LENGTH = 6

fun main() {
    print(
        "Введите длину пароля (минимум $MIN_PW_LENGTH символов)," +
                "который хотите сгенерировать: "
    )
    var pwLength = readln().toInt()

    while (pwLength < MIN_PW_LENGTH) {
        print(
            "Упс! Длина пароля должна быть минимум $MIN_PW_LENGTH символов." +
                    "Попробуйте ещё раз: "
        )
        pwLength = readln().toInt()
    }

    val allChars = ('a'..'z') + ('A'..'Z') + (0..9)
    val pwRange = 1..pwLength

    var generatedPassword = ""

    for (i in pwRange) {
        generatedPassword += allChars.random()
    }
    println(generatedPassword)
}