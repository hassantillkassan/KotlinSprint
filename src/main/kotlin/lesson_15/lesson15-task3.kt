package lesson_15

abstract class MembersOfForum() {

    abstract val name: String

    abstract fun readForum()
    abstract fun writeMessage(message: String)
}

interface ExtraPermits {

    fun deleteMessage()
    fun deleteUser(userName: String)
}

class User(override val name: String) : MembersOfForum() {

    override fun readForum() {
        println("Пользователь \"$name\" читает форум")
    }

    override fun writeMessage(message: String) {
        println("Пользователь \"$name\" написал сообщение")
    }

}

class Admin(override val name: String) : MembersOfForum(), ExtraPermits {
    override fun readForum() {
        println("Администратор \"$name\" читает форум")
    }

    override fun writeMessage(message: String) {
        println("Администратор \"$name\" написал сообщение")
    }

    override fun deleteMessage() {
        println("Администратор \"$name\" удалил сообщение")
    }

    override fun deleteUser(userName: String) {
        println("Администратор \"$name\" удалил пользователя \"$userName\"")
    }

}

fun main() {

    val user1 = User("John")
    val admin1 = Admin("Hummer")

    user1.writeMessage("Hello!")

    admin1.deleteMessage()
    admin1.deleteUser("John")
}