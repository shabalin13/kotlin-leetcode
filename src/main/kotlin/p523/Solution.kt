package p523

class Solution {
    fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
        val reminderToIdx = mutableMapOf(0 to -1)
        var prefixSumMod = 0
        for (i in nums.indices) {
            prefixSumMod = (prefixSumMod + nums[i]) % k
            if (prefixSumMod in reminderToIdx) {
                if (reminderToIdx[prefixSumMod] != i - 1) {
                    return true
                }
            } else {
                reminderToIdx[prefixSumMod] = i
            }
        }
        return false
    }
}
