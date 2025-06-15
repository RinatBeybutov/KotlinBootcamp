package org.example.sprint_2.task_15

class ListOperations {

    companion object {
        fun sunOfEvenNumbers(list: List<Int>): Int = list
            .filter { num -> num % 2 == 0 }
            .sum()

        fun findMax(list: List<Int>): Int =
            list.maxOrNull() ?: 0

        fun findAverage(list: List<Int>): Double =
            list.average()

        fun countStringsStartingWith(list: List<String>, letter: Char): Int =
            list.filter { str -> str[0] == letter }.size

        fun filterStringsContainingSubstring(list: List<String>, substring: String): List<String> =
            list.filter { str -> str.contains(substring) }

        fun sortByLength(list: List<String>): List<String> =
            list.sortedBy { str -> str.length }

        fun allMatchCondition(list: List<Int>, condition: (Int) -> Boolean): Boolean =
            list.all(condition)

        fun findMinGreaterThan(numbers: List<Int>, min: Int): Int =
            numbers.filter { x -> x > min }
                .minOrNull() ?: 0

        fun convertToLengths(strings: List<String>): List<Int> =
            strings.map { str -> str.length }
    }
}