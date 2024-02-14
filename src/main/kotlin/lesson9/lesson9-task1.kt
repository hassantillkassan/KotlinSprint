package lesson9

fun main() {
    val listOfIngredients = listOf("bread", "tomato", "cucumber", "ham", "sauce", "egg")

    println("В рецепте есть следующие ингредиенты: ")
    listOfIngredients.forEach(::println)
}