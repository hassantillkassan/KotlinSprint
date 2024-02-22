package lesson_11

class RecipeCategory(
    val categoryName: String,
    val cover: String,
    val id: Int,
    private val dishName: String,
    val dishImage: String,
) {
    fun moveToRecipeCategories() {
        println("Вы перешли на страницу с категориями")
    }

    fun moveToFavorites() {
        println("Вы перешли на страницу с избранными рецептами")
    }

    fun selectRecipe() {
        println("Открылась страница с рецептом $dishName")
    }
}

class Recipe(
    private val recipeName: String,
    private var numberOfPortions: Int,
    val listOfIngredients: List<Ingredient> = listOf(),
    val cookingMethod: String,
    private var inFavorites: Boolean = false,
) {
    fun addToFavorites() {
        println("Рецепт блюда $recipeName добавлен в \"Избранное\"")
        inFavorites = true
    }

    fun removeToFavorites() {
        println("Рецепт блюда $recipeName удалён из \"Избранного\"")
        inFavorites = false
    }

    fun changeNumberOfPortionsBySlider() {
        numberOfPortions++
        numberOfPortions--
    }
}

data class Ingredient(
    val name: String,
    val gram: Int,
)

