package lesson8

fun main() {
    val arrayOfSandwichIngredients = arrayOf(
        "bread", "tomato", "cucumber", "tomato",
        "ham", "sauce", "egg"
    )

    print("Введите ингредиент, который хотите найти (на английском): ")
    val enteredIngredient = readlnOrNull()

    for (i in arrayOfSandwichIngredients) {
        if (i == enteredIngredient) {
            println("Ингредиент $enteredIngredient в рецепте есть")
            return
        } else {
            println("Такого ингредиента в рецепте нет")
            return
        }
    }
}