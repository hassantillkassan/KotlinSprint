package lesson9

fun main() {
    var listOfIngredients: MutableSet<String>
    var enteredIngredient: String

    do {
        print(
            "Введите пять названий ингредиентов блюда, разделяя их запятыми с пробелом" +
                    " (не повторяйтесь): "
        )
        enteredIngredient = readln()
        listOfIngredients = enteredIngredient.split(", ").toMutableSet()
    } while (listOfIngredients.size != 5)

    val sortedListOfIngredient = listOfIngredients.sorted()

    sortedListOfIngredient.forEachIndexed() { index, element ->
        when (index) {
            0 -> print("${element.capitalize()}, ")
            4 -> print("$element.")
            else -> print("$element, ")
        }
    }
}