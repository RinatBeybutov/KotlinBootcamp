package org.example.sprint_2.task_04

import java.util.function.Consumer
import java.util.function.Function
import java.util.function.Predicate

class InventoryManager {

    fun addItem(character: Character, item: Item, action: Consumer<Item>) {
        character.inventory.add(item)
        action.accept(item)
    }

    fun removeItem(character: Character, item: Item, predicate: Predicate<Item>) {
        character.inventory.removeIf(predicate)
    }

    fun updateItem(character: Character,
                   predicate: Predicate<Item>,
                   action: Function<Item, Item>) {
        val inventory = character.inventory
        for (index in inventory.indices) {
            if(predicate.test(inventory[index])) {
                inventory[index] = action.apply(inventory[index])
            }
        }
    }
}