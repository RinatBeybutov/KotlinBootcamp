package sprint_1.task_07

class HogwartsSpells {
    private val spellById = mutableMapOf<Int, SpellEvent>()
    private val spellByEventType = mutableMapOf<String, MutableList<SpellEvent>>()
    private var idCounter = 0

    fun addSpellEvent(eventType: String, actionDescription: String) {
        val spellEvent = SpellEvent(idCounter, eventType, actionDescription)
        spellById[idCounter] = spellEvent
        val spells = spellByEventType.computeIfAbsent(eventType) { mutableListOf() }
        spells.add(spellEvent)
        idCounter++
    }

    fun getSpellEventById(id: Int) = spellById[id]

    fun getSpellEventsByType(eventType: String) = spellByEventType[eventType].orEmpty()

    fun deleteSpellEvent(id: Int) {
        val removedSpell = spellById.remove(id) ?: return
        val spellsByType = spellByEventType[removedSpell.eventType]
        spellsByType?.remove(removedSpell)
        if(spellsByType?.isEmpty() == true) {
            spellByEventType.remove(removedSpell.eventType)
        }
    }

    fun printAllSpellEvents() {
        spellById.forEach { (_, spellEvent) ->
            println("ID: ${spellEvent.id}, Тип: ${spellEvent.eventType}, Данные: ${spellEvent.action}")
        }
    }

}