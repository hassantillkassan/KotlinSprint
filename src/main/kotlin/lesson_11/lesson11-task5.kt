package lesson_11

class Forum(
    private val listOfUsers: MutableList<ForumMember> = mutableListOf(),
    private val listOfMessage: MutableList<ForumMessage> = mutableListOf(),
) {
    private var generatedId = 0
    fun createNewUser(name: String): ForumMember {
        generatedId++

        val forumMember = ForumMember(
            userId = generatedId,
            userName = name,
        )

        listOfUsers.add(forumMember)

        return forumMember
    }

    fun createNewMessage(id: Int): ForumMessage {
        var enteredMessage = String()

        do {
            listOfUsers.forEach {
                if (it.userId == id) {
                    print("Введите ваше сообщение: ")
                    enteredMessage = readln()
                }
            }
        } while (enteredMessage.isEmpty())

        val forumMessage = ForumMessage(
            authorId = id,
            message = enteredMessage,
        )

        listOfMessage.add(forumMessage)
        return forumMessage
    }

    fun printThread() {
        listOfMessage.forEach {
            println("${listOfUsers[it.authorId - 1].userName}: ${it.message}")
        }
    }
}

data class ForumMember(
    val userId: Int,
    val userName: String,
)

data class ForumMessage(
    val authorId: Int,
    val message: String
)

fun main() {
    val forum1 = Forum()

    forum1.createNewUser("Pashok")
    forum1.createNewUser("Jeka007")

    forum1.createNewMessage(1)
    forum1.createNewMessage(2)

    forum1.printThread()
}