package org.example.sprint_2.task_07

import java.util.function.BiConsumer

class DictionaryProcessor {

    fun processWord(word: String, translation: String, consumer: BiConsumer<String, String>) {
        consumer.accept(word, translation)
    }
}