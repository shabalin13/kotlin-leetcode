package p16

import kotlin.math.abs

class Solution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        var result = Int.MAX_VALUE
        var minDistance = Int.MAX_VALUE
        nums.sort()

        for (i in 0 until nums.size) {
            var j = i + 1
            var k = nums.size - 1
            while (j < k) {
                val sum = nums[i] + nums[j] + nums[k]
                val distance = abs(sum - target)

                if (distance < minDistance) {
                    minDistance = distance
                    result = sum
                }

                if (sum == target) {
                    return target
                } else if (sum > target) {
                    k--
                } else {
                    j++
                }
            }
        }

        return result
    }
}
