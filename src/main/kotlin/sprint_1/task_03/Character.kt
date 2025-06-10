package sprint_1.task_03

abstract class Character(
    var name: String,
    var intelligence: Int,
    var agility: Int,
    var strength: Int,
    var health: Int = 100
) {

    constructor(name: String) : this(name, 5, 5, 5)

    abstract fun attack(opponent: Character)

    fun checkHealth() {
        if (health <= 0) {
            println("Character $name is dead")
            health = 0
        }
    }
}