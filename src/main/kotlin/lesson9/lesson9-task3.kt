package lesson9


fun main() {
    val listOfIngredients = listOf(2, 50, 15)

    print("Введите количество порций, которое хотите приготовить: ")
    val enteredNumberOfPortions = readln().toInt()

    print("На $enteredNumberOfPortions порций вам понадобится: ")

    val userListOfIngredients = listOfIngredients.map { it * enteredNumberOfPortions }
    userListOfIngredients.forEachIndexed() { index, element ->
        when (index) {
            0 -> print("Яиц – $element, ")
            1 -> print("молока – $element, ")
            2 -> print("сливочного масла – $element")
        }
    }
}

