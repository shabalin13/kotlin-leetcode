package p1437

class Solution {
    fun kLengthApart(nums: IntArray, k: Int): Boolean {
        var prevI = -1
        for (i in nums.indices) {
            if (nums[i] == 1) {
                if (prevI != -1 && i - prevI - 1 < k) return false
                else prevI = i
            }
        }
        return true
    }
}
