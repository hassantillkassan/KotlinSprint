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

    val pwCharRange = 'a'..'z'
    val pwCharUppercaseRange = 'A'..'Z'
    val pwNumberRange = 0..9
    val pwRange = 1..pwLength

    var generatedPassword = ""

    for (i in pwRange) {
        val randomCharacterList = listOf(
            pwCharRange.random().toString(),
            pwCharUppercaseRange.random().toString(),
            pwNumberRange.random().toString()
        )
        generatedPassword += randomCharacterList.random()
    }
    println(generatedPassword)
}