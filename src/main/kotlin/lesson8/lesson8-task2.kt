package lesson8

fun main() {
    val arrayOfSandwichIngredients = arrayOf(
        "bread", "tomato", "cucumber", "tomato",
        "ham", "sauce", "egg"
    )

    print("Введите ингредиент, который хотите найти (на английском): ")
    val enteredIngredient = readlnOrNull()

    for (i in arrayOfSandwichIngredients) {
        if (enteredIngredient !in arrayOfSandwichIngredients) {
            println("Такого ингредиента в рецепте нет")
            return
        }
    }
    println("Ингредиент $enteredIngredient в рецепте есть")
}