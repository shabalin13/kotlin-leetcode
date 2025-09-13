package p268

class Solution {
    fun missingNumber(nums: IntArray): Int {
        val n = nums.size
        val necessarySum = n * (n + 1) / 2
        val actualSum = nums.sum()
        return necessarySum - actualSum
    }

    /*
    XOR operation
    fun missingNumber(nums: IntArray): Int {
        var result = 0

        for (i in 0..nums.size) {
            result = result xor i
        }
        for (num in nums) {
            result = result xor num
        }

        return result
    }
     */
}
