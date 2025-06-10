package sprint_1.task_03

class Archer(name: String) : Character(name, 5, 10, 3) {

    override fun attack(opponent: Character) {
        if(opponent.health > 0) {
            opponent.health -= this.agility
        }
        opponent.checkHealth()
    }
}