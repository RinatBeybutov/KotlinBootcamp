package org.example.sprint_2.task_07

fun main() {
    val dictionaryProcessor = DictionaryProcessor()

    val map = mutableMapOf<String, String>()

    val consumer = { word: String, translation: String -> map[word] = translation }

    dictionaryProcessor.processWord("Hi", "World", consumer)

    println(map)
}