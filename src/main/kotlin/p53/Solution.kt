package p53

class Solution {
    /*
    Dynamic programming
    fun maxSubArray(nums: IntArray): Int {
        val dp = IntArray(nums.size)
        dp[0] = nums[0]
        for (i in 1 until nums.size) {
            dp[i] = nums[i] + maxOf(0, dp[i - 1])
        }
        return dp.max()
    }
     */

    fun maxSubArray(nums: IntArray): Int {
        var result = nums[0]
        var curSum = nums[0]
        for (i in 1 until nums.size) {
            curSum = nums[i] + maxOf(0, curSum)
            result = maxOf(result, curSum)
        }
        return result
    }
}
