package sprint_1.task_05

fun main() {
    val reverse = Example.reverse(intArrayOf(1, 2, 3, 4, 5))
    println(reverse.joinToString())
    val reverse1 = Example.reverseV2(intArrayOf(1, 2, 3, 4, 5))
    println(reverse1.joinToString())
}