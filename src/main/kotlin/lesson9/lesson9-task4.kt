package lesson9

fun main() {
    var listOfIngredients: List<String>

    do {
        print("Введите пять названий ингредиентов блюда, разделяя их запятыми (с пробелом): ")
        val enteredIngredients = readln()

        listOfIngredients = enteredIngredients.split(", ")
    } while (listOfIngredients.size != 5)

    val sortedListOfIngredients = listOfIngredients.sorted()
    sortedListOfIngredients.forEach(::println)
}