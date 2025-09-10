package p283

class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var zerosCount = 0
        for (i in 0 until nums.size) {
            if (nums[i] == 0) {
                zerosCount++
            } else if (zerosCount > 0 && i - zerosCount >= 0) {
                nums[i - zerosCount] = nums[i]
                nums[i] = 0
            }
        }
    }

    /*
    Stupid solution
    fun moveZeroes(nums: IntArray): Unit {
        var i = 0
        val count = nums.size - nums.count { it == 0 }
        while (i < count) {
            if (nums[i] == 0) {
                for (j in i + 1 until nums.size) {
                    nums[j - 1] = nums[j]
                }
                nums[nums.size - 1] = 0
            }
            if (nums[i] != 0) i++
        }
    }
     */
}
