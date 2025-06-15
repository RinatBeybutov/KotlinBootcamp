package org.example.sprint_2.task_08

fun main() {

    val messageProcessor = MessageProcessor()

    val lengthFilter = MessageFilter {message: String -> message.length > 6}

    val filters = listOf(lengthFilter)

    var message = "Hello"
    var isValid = messageProcessor.processMessage(message, filters)
    if (isValid) println("$message is valid") else println("$message is not valid")

    message = "Long message"
    isValid = messageProcessor.processMessage(message, filters)
    if (isValid) println("$message is valid") else println("$message is not valid")
}