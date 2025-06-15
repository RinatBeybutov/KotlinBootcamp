package org.example.sprint_2.task_05

fun main() {
    val remoteService = RemoteService()

    val remoteServiceMethod: () -> String = { remoteService.call("Param") }
    val error: (e: Exception) -> String = { e ->
        println(e.message)
        "Default"
    }

    val result = ErrorHandler.handleError(
        remoteServiceMethod,
        error
    )

    println(result)
}