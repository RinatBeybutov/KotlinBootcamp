package org.example.sprint_2.task_08

class MessageProcessor {

    fun processMessage(message: String, filters: List<MessageFilter>): Boolean {
        for (filter in filters) {
            if(!filter.filter(message)) {
                return false
            }
        }
        return true
    }
}