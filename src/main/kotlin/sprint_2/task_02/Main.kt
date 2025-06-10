package org.example.sprint_2.task_02

fun main() {

    val notificationManager = NotificationManager()

    notificationManager.registerHandler(NotificationType.EMAIL)
    { notification -> println("Отправка по электронной почте: ${notification.message}") }

    notificationManager.registerHandler(NotificationType.SMS)
    { notification -> println("Отправка по SMS: ${notification.message}") }

    notificationManager.registerHandler(NotificationType.PUSH)
    { notification -> println("Отправка через Push-уведомление: ${notification.message}") }

    val email = Notification(NotificationType.EMAIL, "Привет, мир!")
    val sms = Notification(NotificationType.SMS, "Привет, мир!")

    notificationManager.notify(email)
    notificationManager.notify(sms)
}