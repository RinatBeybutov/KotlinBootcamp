package sprint_1.task_01

fun groupUsers(users: List<User>): Map<Int, List<User>> {
    var result = mutableMapOf<Int, MutableList<User>>()
    for (user in users) {
        result.putIfAbsent(user.age, mutableListOf())
        result[user.age]?.add(user)
    }
    return result
}
