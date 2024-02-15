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


    println(
        sortedListOfIngredient[0].replaceFirstChar(Char::uppercaseChar) +
                sortedListOfIngredient.drop(1).joinToString(
                    prefix = ", ",
                    separator = ", ",
                    postfix = "."
                )
    )
}