package p581

class Solution {
    /*
    Sorting approach
    fun findUnsortedSubarray(nums: IntArray): Int {
        val sortedNums = nums.sorted()
        var start = 0
        var end = -1

        for (i in 0 until nums.size) {
            if (nums[i] != sortedNums[i]) {
                start = i
                break
            }
        }

        for (i in nums.size - 1 downTo 0) {
            if (nums[i] != sortedNums[i]) {
                end = i
                break
            }
        }

        return end - start + 1
    }
     */

    /*
    Optimized sorting approach
    fun findUnsortedSubarray(nums: IntArray): Int {
        val sortedNums = nums.sorted()
        var start = nums.size
        var end = -1

        for (i in 0 until nums.size) {
            if (nums[i] != sortedNums[i]) {
                start = minOf(start, i)
                end = maxOf(end, i)
            }
        }

        return if (start == nums.size && end == -1) 0 else end - start + 1
    }
     */

    fun findUnsortedSubarray(nums: IntArray): Int {
        var minNum = Int.MAX_VALUE
        var maxNum = Int.MIN_VALUE

        var flag = false
        for (i in 1 until nums.size) {
            if (nums[i] < nums[i - 1]) {
                flag = true
            }
            if (flag) {
                minNum = minOf(minNum, nums[i])
            }
        }

        flag = false
        for (i in nums.size - 2 downTo 0) {
            if (nums[i] > nums[i + 1]) {
                flag = true
            }
            if (flag) {
                maxNum = maxOf(maxNum, nums[i])
            }
        }

        var start = 0
        while (start < nums.size) {
            if (minNum < nums[start]) {
                break
            }
            start++
        }

        var end = nums.size - 1
        while (end >= 0) {
            if (maxNum > nums[end]) {
                break
            }
            end--
        }

        return if (end - start < 0) 0 else end - start + 1
    }
}
