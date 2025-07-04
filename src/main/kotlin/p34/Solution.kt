package p34

class Solution {
    /*
    My solution
    fun searchRange(nums: IntArray, target: Int): IntArray {
        var left = 0
        var right = nums.size - 1

        var start = -1
        var end = -1

        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] == target && (mid + 1 >= nums.size || nums[mid + 1] > target)) {

                end = mid
                break
            } else if (nums[mid] <= target) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        left = 0
        right = nums.size - 1
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] == target && (mid - 1 < 0 || nums[mid - 1] < target)) {
                start = mid
                break
            } else if (nums[mid] >= target) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        return intArrayOf(start, end)
    }
     */

    fun searchRange(nums: IntArray, target: Int): IntArray {

        fun binarySearch(nums: IntArray, target: Int, isForStart: Boolean): Int {
            var left = 0
            var right = nums.size - 1
            var result = -1
            while (left <= right) {
                val mid = (left + right) / 2
                if (nums[mid] < target) {
                    left = mid + 1
                } else if (nums[mid] > target) {
                    right = mid - 1
                } else {
                    result = mid
                    if (isForStart) {
                        right = mid - 1
                    } else {
                        left = mid + 1
                    }
                }
            }
            return result
        }

        val start = binarySearch(nums, target, isForStart = true)
        val end = binarySearch(nums, target, isForStart = false)

        return intArrayOf(start, end)
    }
}
