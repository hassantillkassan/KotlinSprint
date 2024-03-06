package lesson_14

open class Chat(
    val listOfMessages: MutableList<Message> = mutableListOf(),
    val listOfChildMessages: MutableList<ChildMessage> = mutableListOf(),
) {

    open fun addMessage(message: String, name: String): Message {
    }

    open fun addThreadMessage(message: String, name: String, parentMessageId: Int): ChildMessage {
    }

    fun printChat() {
        println(listOfMessages.groupBy { it.id })
        println(listOfChildMessages.groupBy { it.parentMessageId })
    }
}

class Message(
    val id: Int,
    val message: String = String(),
    val name: String = String(),
    listOfMessages: MutableList<Message> = mutableListOf(),
) : Chat(listOfMessages = listOfMessages) {

    override fun addMessage(message: String, name: String): Message {
        val message = Message(
            id = id,
            message = message,
            name = name,
        )

        listOfMessages.add(message)

        return message
    }
}

class ChildMessage(
    val id: Int,
    val parentMessageId: Int = 0,
    val childMessage: String = String(),
    val name: String = String(),
    listOfChildMessages: MutableList<ChildMessage> = mutableListOf(),
) : Chat(listOfChildMessages = listOfChildMessages) {

    override fun addThreadMessage(message: String, name: String, parentMessageId: Int): ChildMessage {
        val childMessage = ChildMessage(
            id = id,
            parentMessageId = parentMessageId,
            childMessage = message,
            name = name,
        )

        listOfChildMessages.add(childMessage)

        return childMessage
    }
}

fun main() {

    val message1 = Message(1)
    message1.addMessage("Hello", "Alex07")

    val message2 = Message(2)
    message2.addMessage("Hi everyone", "Serega")

    val message3 = Message(3)
    message3.addMessage("Wassup boyz", "Kirill")

    val childMessage1 = ChildMessage(4)
    childMessage1.addThreadMessage("Hey, Alex! What's new?", "Bo$$", 1)

    val childMessage2 = ChildMessage(5)
    childMessage2.addThreadMessage("Sergio! Haven't seen you for ages, bro", "Oleg Mongol",
        2)

    val chat1 = Chat(
        listOfMessages = mutableListOf(message1, message2, message3),
        listOfChildMessages = mutableListOf(childMessage1, childMessage2)
    )

    println(childMessage1.childMessage)
    chat1.printChat()
}