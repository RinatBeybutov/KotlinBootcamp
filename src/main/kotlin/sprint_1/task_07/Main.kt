package sprint_1.task_07

fun main() {
    val h = HogwartsSpells()
    h.addSpellEvent("Защита", "Защита от зеленого заклинания")

    val spellEventById = h.getSpellEventById(1)

    val existedList = h.getSpellEventsByType("Защита")
    val notExistedList = h.getSpellEventsByType("Волшебство")

    h.printAllSpellEvents()

    h.deleteSpellEvent(0)
    println()
}