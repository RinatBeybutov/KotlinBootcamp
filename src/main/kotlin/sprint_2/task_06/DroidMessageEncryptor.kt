package org.example.sprint_2.task_06

fun interface DroidMessageEncryptor {
    fun encrypt(message: String, key: Int): String
}