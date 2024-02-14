package lesson9

fun main() {
    val mapOfIngredients = mutableMapOf("Яиц" to 2, "молока" to 50, "масла" to 15)
    println(mapOfIngredients)

    print("Введите количество порций, которое хотите приготовить: ")
    val enteredNumberOfPortions = readln().toInt()

    print("На $enteredNumberOfPortions порций вам понадобится: ")
    mapOfIngredients.forEach {
        print("${it.key} – ${it.value * enteredNumberOfPortions}, ")
    }
}