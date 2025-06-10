package sprint_1.task_02

fun main() {
    try {
        val user1 = User("John", 20, "Google", "London")
        println(user1)
    } catch (exception: IllegalArgumentException) {
        println("${exception.message}")
    }

    try {
        val user2 = User("Mike", 5, "Amazon", "Amsterdam")
    } catch (exception: IllegalArgumentException) {
        println("${exception.message}")
    }

    try {
        val user3 = User("Alex", 20, "yanxed", "MSK")
    } catch (exception: IllegalArgumentException) {
        println("${exception.message}")
    }
}