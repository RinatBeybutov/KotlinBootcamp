package org.example.sprint_2.task_04

fun main() {
    val frodo = Character("frodo", mutableListOf())
    var item = Item("Ring", 1000)
    var item1 = Item("Gloves", 20)

    val manager = InventoryManager()

    manager.addItem(frodo, item) { println("${item.name} added") }
    manager.addItem(frodo, item1) { println("${item1.name} added") }

    manager.updateItem(frodo,
        { item: Item -> item.name.equals("Ring") },
        { item: Item -> Item(item.name, 2 * item.value) }
    )

    println(frodo.inventory[0].value)

}