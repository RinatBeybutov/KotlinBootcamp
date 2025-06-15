package org.example.sprint_2.task_05

import java.util.function.Supplier

class ErrorHandler {

    companion object {
        fun <T> handleError(action: Supplier<T>, errorHandler: ExceptionHandler<T>): T {
            return try {
                action.get()
            } catch (e: Exception) {
                errorHandler.handle(e)
            }
        }
    }
}
