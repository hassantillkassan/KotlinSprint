package lesson_15

interface Flyable {

    fun takeFlight()

}

interface Swimable {

    fun startSwimming()

}

interface Runnable {

    fun startRunning()

}


class Carp : Swimable {

    override fun startSwimming() {
        println("Поплыл")
    }

}

class Gull : Flyable, Runnable, Swimable {

    override fun takeFlight() {
        println("Полетела")
    }

    override fun startSwimming() {
        println("Поплыла")
    }

    override fun startRunning() {
        println("Побежала")
    }

}

class Duck : Swimable, Runnable {
    override fun startSwimming() {
        println("Поплыла")
    }

    override fun startRunning() {
        println("Побежала")
    }

}

fun main() {

    val carp1 = Carp()
    val gull1 = Gull()
    val duck1 = Duck()

    carp1.startSwimming()

    gull1.takeFlight()
    gull1.startSwimming()
    gull1.startRunning()

    duck1.startSwimming()
    duck1.startRunning()

}