package lesson8

fun main() {
    print("Введите количество ингредиентов, которое хотите уместить в список: ")
    val numberOfIngredients = readln().toInt()

    val arrayOfIngredients = Array(numberOfIngredients) { "" }
    var enteredIngredient: String

    for (i in arrayOfIngredients.indices) {
        print("Введите ингредиент номер: ")
        enteredIngredient = readln()
        arrayOfIngredients[i] = enteredIngredient
    }

    println("Ваш список ингредиентов: ${arrayOfIngredients.contentToString()}")
}