package p3542

class Solution {
    fun minOperations(nums: IntArray): Int {
        var result = 0
        val stack = ArrayDeque<Int>()

        for (num in nums) {
            while (stack.isNotEmpty() && stack.last() > num) stack.removeLast()
            if (num == 0) continue
            if (stack.isEmpty() || num > stack.last()) {
                result++
                stack.add(num)
            }
        }

        return result
    }

    /*
    fun minOperations(nums: IntArray): Int {
        var result = 0
        val stack = ArrayDeque<Int>()

        for (num in nums) {
            while (stack.isNotEmpty() && stack.last() > num) {
                result++
                stack.removeLast()
            }
            if (num == 0) continue
            if (stack.isEmpty() || stack.last() < num) stack.add(num)
        }

        result += stack.size
        return result
    }
     */
}
