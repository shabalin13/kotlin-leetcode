package p1493

class Solution {
    /*
    fun longestSubarray(nums: IntArray): Int {
        var left = 0
        var right = nums.indexOfFirst { it == 0 }

        if (right == -1) return nums.size - 1

        var prevZeroId = right
        var result = right - left

        for (right in right + 1 until nums.size) {
            if (nums[right] == 0) {
                left = prevZeroId + 1
                prevZeroId = right
            }
            result = maxOf(result, right - left)
        }

        return result
    }
     */

    fun longestSubarray(nums: IntArray): Int {
        var left = 0
        var zeroCount = 0
        var result = 0

        for (right in 0 until nums.size) {
            if (nums[right] == 0) zeroCount++
            while (zeroCount > 1) {
                if (nums[left] == 0) zeroCount--
                left++
            }
            result = maxOf(result, right - left)
        }

        return result
    }
}
