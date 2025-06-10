package org.example.sprint_2.task_01

fun main() {
    val spellCaster = SpellCaster()
    val lumos = "lumos"

    spellCaster.cast(lumos) { spell -> "A beam of light is created by $spell" }
}