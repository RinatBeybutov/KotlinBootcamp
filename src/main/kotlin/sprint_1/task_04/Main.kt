package sprint_1.task_04

fun main() {
    val users = listOf(
        User(1, "John", 25, setOf("Sports", "Music")),
        User(2, "Alice", 30, setOf("Reading", "Cooking")),
        User(3, "Bob", 28, setOf("Sports", "Hiking")),
        User(4, "Eva", 35, setOf("Traveling", "Painting")),
        User(5, "Mike", 22, setOf("Gaming", "Cooking"))
    )
    val result1 = User.findHobbyLoversV1(users, setOf("Cooking"))
    println(result1)

    val result2 = User.findHobbyLoversV2(users, setOf("Sports"))
    println(result2)
}