package p1004

class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var result = 0
        var left = 0
        var right = 0
        var curK = 0

        while (right < nums.size) {
            if (nums[right] == 0) {
                curK++
                while (curK > k) {
                    if (nums[left] == 0) {
                        curK--
                    }
                    left++
                }
            }
            result = maxOf(result, right - left + 1)
            right++
        }

        return result
    }
}
