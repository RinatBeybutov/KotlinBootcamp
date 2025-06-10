package org.example.sprint_1.task_01

import sprint_1.task_01.User
import sprint_1.task_01.groupUsers

fun main() {
    val User1 = User("John", 20, "Google", "USA")
    val User2 = User("Mike", 21, "Amazon", "USA")
    val User3 = User("Alex", 20, "Amazon", "USA")
    val list = listOf(User1, User2, User3)
    val groupedUsers = groupUsers(list)
    println(groupedUsers)
}