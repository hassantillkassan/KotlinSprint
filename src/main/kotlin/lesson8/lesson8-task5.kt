package lesson8

fun main() {
    print("Введите количество ингредиентов, которое хотите уместить в список: ")
    val numberOfIngredients = readln().toInt()

    var arrayOfIngredients = arrayOf<String>()
    var index = 0

    for (i in 0 until numberOfIngredients) {
        print("Введите ингредиент номер ${++index} из $numberOfIngredients: ")
        val enteredIngredient = readln()
        arrayOfIngredients += enteredIngredient
    }

    println("Ваш список ингредиентов: ${arrayOfIngredients.contentToString()}")
}