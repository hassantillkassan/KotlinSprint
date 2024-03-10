package lesson_14

class Chat {

    val listOfMessages: MutableList<Message> = mutableListOf()
    val listOfChildMessage: MutableList<ChildMessage> = mutableListOf()
    var idCounter = 1

    fun addMessage(text: String, name: String) {
        val message = Message(
            id = idCounter,
            name = name,
            text = text,
        )

        listOfMessages.add(message)
        idCounter++
    }

    fun addThreadMessage(text: String, name: String, parentMessageId: Int) {
        val childMessage = ChildMessage(
            id = idCounter,
            parentMessageId = parentMessageId,
            name = name,
            childText = text,
        )

//        val index = listOfMessages.indexOfFirst { it.id == parentMessageId }
//        listOfMessages.add((index + 1), childMessage)

        listOfChildMessage.add(childMessage)
        idCounter++
    }

    fun printChat() {
        val groupedByIds = listOfMessages.groupBy { it.id }
        val groupByParentIds = listOfChildMessage.groupBy { it.parentMessageId }

        for (message in groupedByIds) {
            println(message.value.joinToString { it.text })

            for (childMessage in groupByParentIds) {
                if (message.key == childMessage.key)
                    println(childMessage.value.joinToString { it.text })
            }
            println()
        }

    }
}

open class Message(
    val id: Int,
    val name: String,
    val text: String,
)

class ChildMessage(
    id: Int,
    val parentMessageId: Int,
    name: String,
    childText: String,
) : Message(id, name, childText)

fun main() {

    val chat1 = Chat()

    chat1.addMessage("Hey everyone!", "Alex")
    chat1.addMessage("Hi, can you tell me where is the best place to learn Kotlin?", "Oleg")
    chat1.addMessage("Is there anyone here?", "Pavel")

    chat1.addThreadMessage("Hello, Alex! Wassup?", "Zurab", 1)
    chat1.addThreadMessage("Check out KotlinSprint", "Proger007", 2)

    chat1.printChat()

}