package p977

import kotlin.math.abs

class Solution {
    /*
    With sorting O(NlogN)
    fun sortedSquares(nums: IntArray): IntArray {
        return nums.map { it * it }.sorted().toIntArray()
    }
     */

    /* Optimized two pointers O(N) */
    fun sortedSquares(nums: IntArray): IntArray {
        var left = 0
        var right = nums.size - 1
        val result = IntArray(nums.size)
        for (i in nums.size - 1 downTo 0) {
            if (abs(nums[left]) < abs(nums[right])) {
                result[i] = nums[right] * nums[right]
                right--
            } else {
                result[i] = nums[left] * nums[left]
                left++
            }
        }
        return result
    }
}
