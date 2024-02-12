package lesson9

fun main() {
    val listOfIngredients = mutableListOf("bread", "tomato", "cucumber", "ham", "sauce", "egg")

    print(
        "В рецепте есть базовые ингредиенты: $listOfIngredients\n" +
                "Желаете добавить ещё? Введите \"да\" или \"нет\": "
    )
    val userChoice = readln()

    if (userChoice == "да") {
        print("Какой ингредиент вы хотите добавить? Введите название: ")
        val enteredIngredient = readln()
        listOfIngredients.add(enteredIngredient)
    } else return

    println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")
}