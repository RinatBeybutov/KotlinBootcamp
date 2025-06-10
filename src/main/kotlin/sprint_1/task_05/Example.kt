package sprint_1.task_05

class Example {

    companion object {
        fun reverse(nums: IntArray): IntArray {
            var result = IntArray(nums.size)
            for (i in nums.indices.reversed()) {
                result[nums.size - i - 1] = nums[i]
            }
            return result
        }

        fun reverseV2(nums: IntArray): IntArray {
            val result = nums.copyOf()
            result.reverse()
            return result
        }
    }
}