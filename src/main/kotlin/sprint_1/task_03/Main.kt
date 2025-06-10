package sprint_1.task_03

fun main() {
    val warior1 = Warior("Ares");
    val warior2 = Warior("God");

    val archer1 = Archer("Legolas");

    warior1.attack(warior2)
    archer1.attack(warior2)

    println(warior2.health)
}