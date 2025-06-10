package org.example.sprint_2.task_01

class SpellCaster {
    fun cast(spellName: String, action: SpellAction) {
        val result = action.perform(spellName)
        println(result)
    }
}