package lesson_18

open class Tamagotchi(val name: String) {

    fun startPlaying() = println("$name - играет")

    fun goToSleep() = println("$name - спит")

    open fun haveMeal() = Unit

}

class Fox(name: String) : Tamagotchi(name) {

    override fun haveMeal() {
        println("$name - ест ягоды")
    }

}

class Dog(name: String) : Tamagotchi(name) {

    override fun haveMeal() {
        println("$name - ест кости")
    }

}

class Cat(name: String) : Tamagotchi(name) {

    override fun haveMeal() {
        println("$name - ест рыбу")
    }

}

fun main() {

    val fox1: Tamagotchi = Fox("Фокс")
    val dog1: Tamagotchi = Dog("Бобик")
    val cat1: Tamagotchi = Cat("Мурка")

    fox1.startPlaying()
    fox1.haveMeal()

    dog1.goToSleep()
    dog1.haveMeal()

    cat1.startPlaying()
    cat1.haveMeal()

}