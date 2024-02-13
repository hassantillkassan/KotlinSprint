package lesson8

fun main() {
    val arrayOfSandwichIngredients = arrayOf(
        "bread", "tomato", "cucumber",
        "ham", "sauce", "egg"
    )

    println("Наш список ингредиентов: ${arrayOfSandwichIngredients.contentToString()}")
    var enteredIngredient = String()

    while (arrayOfSandwichIngredients.indexOf(enteredIngredient) == -1) {
        print("Введите ингредиент, который хотите заменить (на английском): ")
        enteredIngredient = readln()
    }

    print("Введите ингредиент, на который хотите заменить (на английском): ")
    val ingredientSubstitution = readln()

    val index = arrayOfSandwichIngredients.indexOf(enteredIngredient)
    arrayOfSandwichIngredients[index] = ingredientSubstitution

    println("Готово! Вы сохранили следующий список: ${arrayOfSandwichIngredients.contentToString()}")
}