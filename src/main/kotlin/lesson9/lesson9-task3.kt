package lesson9

fun main() {
    val mapOfIngredients = mapOf("Яиц" to 2, "молока" to 50, "масла" to 15)

    print("Введите количество порций, которое хотите приготовить: ")
    val enteredNumberOfPortions = readln().toInt()

    print("На $enteredNumberOfPortions порций вам понадобится: ")

    mapOfIngredients.forEach {
        if (it.key == "масла") print("${it.key} – ${it.value * enteredNumberOfPortions}.")
        else print("${it.key} – ${it.value * enteredNumberOfPortions}, ")
    }
}