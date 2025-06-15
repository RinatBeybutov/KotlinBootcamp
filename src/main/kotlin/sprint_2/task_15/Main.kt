package org.example.sprint_2.task_15

fun main() {
    val emptyNumbers = emptyList<Int>()
    val numbers = listOf(1,2,3,4,5,6)
    val strings = listOf("apple", "banana", "cherry", "date")
    val emptyStrings = emptyList<String>()

    println("Максимальное число в списке: ${ListOperations.findMax(numbers)}")
    println("Максимальное число в списке: ${ListOperations.findMax(emptyNumbers)}")
    println("Среднее арифметическое в списке: ${ListOperations.findAverage(numbers)}")
    println("Среднее арифметическое в списке: ${ListOperations.findAverage(emptyNumbers)}")
    println("Сумма четных чисел в списке: ${ListOperations.sunOfEvenNumbers(numbers)}")
    println("Сумма четных чисел в списке: ${ListOperations.sunOfEvenNumbers(emptyNumbers)}")
    println("Начинается с а: ${ListOperations.countStringsStartingWith(strings, 'a')}")
    println("Начинается с а: ${ListOperations.countStringsStartingWith(emptyStrings, 'a')}")
    println("Содержит an: ${ListOperations.filterStringsContainingSubstring(strings, "an")}")
    println("Содержит an: ${ListOperations.filterStringsContainingSubstring(emptyStrings, "an")}")
}