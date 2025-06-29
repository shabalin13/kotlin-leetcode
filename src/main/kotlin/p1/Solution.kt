package p1

class Solution {
    /*
    Brute force solution
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val n = nums.size
        for (i in 0 until n) {
            for (j in (i + 1) until n) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return IntArray(2)
    }
     */

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val dict = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            if (dict[target - nums[i]] != null) {
                return intArrayOf(i, dict[target - nums[i]]!!)
            }
            dict[nums[i]] = i
        }
        return intArrayOf()
    }
}
