package lesson_16

class Player(
    val name: String,
) {

    private var health: Int = 100
    private var impactForce: Int = 20

    fun takeDamage(damageReceived: Int) {
        println("Получено $damageReceived урона")

        if ((health - damageReceived) in 1..99) {
            health -= damageReceived
            println("Остаток здоровья: $health")
        } else killPlayer()


    }

    fun getHeal(healingReceived: Int) {
        if ((health + healingReceived) <= 100) health += healingReceived
        else health = 100

        println("Вы вылечились. Остаток здоровья: $health")
    }

    private fun killPlayer() {
        health = 0
        impactForce = 0

        println("Игрок: $name: Здоровье - $health, Сила - $impactForce. Игра окончена")
    }
}

fun main() {

    val player1 = Player("Pasha")

    player1.takeDamage(20)
    player1.getHeal(30)
    player1.takeDamage(50)
    player1.takeDamage(50)
}