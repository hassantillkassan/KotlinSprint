package lesson_17

class Quiz(
    question: String,
    answer: String,
) {

    val question = question
        get() = "Question: $field"

    var answer = answer
        get() = "Answer: $field"
        set(value: String) {
            if (value == field) println("Верный ответ!")
            else println("Ответ неверный!")
            field = value
        }

}

fun main() {

    val quiz = Quiz("First human space flight?", "1961")
    println(quiz.question)
    quiz.answer = "1961"
    println(quiz.answer)
}