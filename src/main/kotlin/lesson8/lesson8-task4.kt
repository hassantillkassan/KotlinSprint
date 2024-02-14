package lesson8

fun main() {
    val arrayOfSandwichIngredients = arrayOf(
        "bread", "tomato", "cucumber",
        "ham", "sauce", "egg"
    )

    println("Наш список ингредиентов: ${arrayOfSandwichIngredients.contentToString()}")
    var enteredIngredient: String
    var index: Int

    do {
        print("Введите ингредиент, который хотите заменить (на английском): ")
        enteredIngredient = readln()
        index = arrayOfSandwichIngredients.indexOf(enteredIngredient)
        if (enteredIngredient !in arrayOfSandwichIngredients) println(
            "Такого ингредиента " +
                    "нет в списке"
        )
        else break
    } while (index == -1)

    print("Введите ингредиент, на который хотите заменить (на английском): ")
    val ingredientSubstitution = readln()

    arrayOfSandwichIngredients[index] = ingredientSubstitution

    println("Готово! Вы сохранили следующий список: ${arrayOfSandwichIngredients.contentToString()}")
}