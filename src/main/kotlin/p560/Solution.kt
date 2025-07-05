package p560

class Solution {
    /*
    Brute force approach
    fun subarraySum(nums: IntArray, k: Int): Int {
        var sum = 0
        val prefixSums = intArrayOf(0) + nums.map {
            sum = sum + it
            sum
        }

        var result = 0
        for (i in 0 until prefixSums.size) {
            for (j in i + 1 until prefixSums.size) {
                if (prefixSums[j] - prefixSums[i] == k) result++
            }
        }

        return result
    }
     */

    /*
    Good but not optimized memory
    fun subarraySum(nums: IntArray, k: Int): Int {
        var sum = 0
        val prefixSums = intArrayOf(0) + nums.map {
            sum = sum + it
            sum
        }

        val prefixSumToCount = mutableMapOf(0 to 1)

        var result = 0
        for (i in 1 until prefixSums.size) {
            val count = prefixSumToCount.getOrDefault(prefixSums[i] - k, 0)
            result += count
            prefixSumToCount[prefixSums[i]] = prefixSumToCount.getOrDefault(prefixSums[i], 0) + 1
        }

        return result
    }
     */

    fun subarraySum(nums: IntArray, k: Int): Int {
        var sum = 0
        val prefixSumToCount = mutableMapOf(0 to 1)
        var result = 0

        for (i in 0 until nums.size) {
            sum += nums[i]
            result += prefixSumToCount[sum - k] ?: 0
            prefixSumToCount[sum] = (prefixSumToCount[sum] ?: 0) + 1
        }

        return result
    }
}
