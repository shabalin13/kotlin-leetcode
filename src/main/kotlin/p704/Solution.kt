package p704

class Solution {
    /*
    min i, nums[i] <= target
    fun search(nums: IntArray, target: Int): Int {
        var left = -1
        var right = nums.size
        while (left + 1 < right) {
            val mid = (left + right) / 2
            if (nums[mid] > target) {
                right = mid
            } else {
                left = mid
            }
        }
        return if (left == -1 || nums[left] != target) -1 else left
    }
     */

    /*
    max i, nums[i] >= target
    fun search(nums: IntArray, target: Int): Int {
        var left = -1
        var right = nums.size
        while (left + 1 < right) {
            val mid = (left + right) / 2
            if (nums[mid] >= target) {
                right = mid
            } else {
                left = mid
            }
        }
        return if (r == nums.size || nums[right] != target) -1 else right
    }
     */

    /* Default binary search */
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            val mid = (left + right) / 2
            if (nums[mid] == target) return mid
            if (nums[mid] > target) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return -1
    }
}
