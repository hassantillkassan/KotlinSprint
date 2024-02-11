package lesson8

fun main() {
    val arrayOfSandwichIngredients = arrayOf(
        "bread", "tomato", "cucumber", "tomato",
        "ham", "sauce", "egg"
    )

    print("Введите ингредиент, который хотите найти (на английском): ")
    val enteredIngredient = readlnOrNull()

    if (enteredIngredient in arrayOfSandwichIngredients)
        println("Ингредиент $enteredIngredient в рецепте есть")
    else
        println("Такого ингредиента в рецепте нет")
}