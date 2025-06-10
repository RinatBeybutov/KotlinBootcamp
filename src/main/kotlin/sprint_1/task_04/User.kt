package sprint_1.task_04

class User(
    val id : Int,
    var name : String,
    var age : Int,
    var hobbies : Set<String>
) {

    companion object {
        fun findHobbyLoversV1(users: List<User>, hobbies: Set<String>): List<User> {
            var result = mutableListOf<User>()
            for (user in users) {
                for (hobbie in user.hobbies) {
                    if(hobbies.contains(hobbie)) {
                        result.add(user)
                        break
                    }
                }
            }
            return result
        }

        fun findHobbyLoversV2(users: List<User>, hobbies: Set<String>): List<User> {
            return users.filter { user -> user.hobbies.intersect(hobbies).isNotEmpty() }
        }
    }

    override fun toString(): String {
        return name
    }
}