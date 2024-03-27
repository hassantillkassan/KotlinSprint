package lesson_18


open class Screen {

    open val name = String()

    fun draw(x: Int, y: Int, figure: Screen) {
        println("Создан объект: ${figure.name} с координатами ($x, $y)")
    }

    fun draw(x: Float, y: Float, figure: Screen) {
        println("Создан объект: ${figure.name} с координатами ($x, $y)")
    }

    fun draw(x: Int, y: Float, figure: Screen) {
        println("Создан объект: ${figure.name} с координатами ($x, $y)")
    }

    fun draw(x: Float, y: Int, figure: Screen) {
        println("Создан объект: ${figure.name} с координатами ($x, $y)")
    }

}

class Circle : Screen() {
    override val name = "Круг"
}

class Square : Screen() {
    override val name = "Квадрат"
}

class Point : Screen() {
    override val name = "Точка"
}


fun main() {

    val screen1 = Screen()

    val circle = Circle()
    val square = Square()
    val point = Point()

    screen1.draw(2, 3, circle)
    screen1.draw(2.5f, 7.3f, square)
    screen1.draw(5, 5.1f, point)

}