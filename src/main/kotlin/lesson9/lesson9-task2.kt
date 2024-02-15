package lesson9

fun main() {
    val listOfIngredients = mutableListOf("bread", "tomato", "cucumber", "ham", "sauce", "egg")

    print(
        "В рецепте есть базовые ингредиенты: $listOfIngredients\n" +
                "Желаете добавить ещё? Введите \"да\" или \"нет\": "
    )
    var userEntered = readln()

    if (userEntered.equals("да", ignoreCase = true)) {
        print("Какой ингредиент вы хотите добавить? Введите название: ")
        userEntered = readln()
        listOfIngredients.add(userEntered)
    } else return

    println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")
}