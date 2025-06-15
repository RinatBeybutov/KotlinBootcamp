package org.example.sprint_2.task_05

fun interface ExceptionHandler<T> {
    fun handle(e: Exception): T
}