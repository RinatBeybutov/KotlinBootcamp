package org.example.sprint_2.task_02

import java.util.function.Consumer

class NotificationManager {
    private var handlers = mutableMapOf<NotificationType, Consumer<Notification>>()

    fun registerHandler(type: NotificationType, handler: Consumer<Notification>) {
        handlers[type] = handler
    }

    fun notify(notification: Notification) {
        val handler = handlers[notification.type]
        if (handler != null) {
            handler.accept(notification)
        } else {
            println("Unknown notification type for ${notification.type}")
        }
    }
}