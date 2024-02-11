package lesson8

fun main() {
    val arrayOfSandwichIngredients = arrayOf(
        "bread", "tomato", "cucumber",
        "ham", "sauce", "egg"
    )
    var enteredIngredient: String

    println("Наш список ингредиентов: ${arrayOfSandwichIngredients.contentToString()}")

    do {
        print("Введите ингредиент, который хотите заменить (на английском): ")
        enteredIngredient = readln()
    } while (enteredIngredient !in arrayOfSandwichIngredients)

    print("Введите ингредиент, на который хотите заменить (на английском): ")
    val ingredientSubstitution = readln()

    val index = arrayOfSandwichIngredients.indexOf(enteredIngredient)
    arrayOfSandwichIngredients[index] = ingredientSubstitution

    println("Готово! Вы сохранили следующий список: ${arrayOfSandwichIngredients.contentToString()}")
}