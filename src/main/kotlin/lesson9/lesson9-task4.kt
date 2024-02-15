package lesson9

fun main() {
    var listOfIngredients: List<String>
    var enteredIngredients: String

    do {
        print("Введите пять названий ингредиентов блюда, разделяя их запятыми (с пробелом): ")
        enteredIngredients = readln()
        listOfIngredients = enteredIngredients.split(", ")
    } while (listOfIngredients.size != 5)

    val sortedListOfIngredients = listOfIngredients.sorted()
    sortedListOfIngredients.forEach(::println)
}