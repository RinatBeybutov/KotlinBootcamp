package sprint_1.task_03

class Warior(name: String) : Character(name, 3, 5, 10) {

    override fun attack(opponent: Character) {
        println("Health of opponent was ${opponent.health}")
        if(opponent.health > 0) {
            opponent.health -= this.strength
        }
        opponent.checkHealth()
        println("Health of opponent now ${opponent.health}")
    }

}