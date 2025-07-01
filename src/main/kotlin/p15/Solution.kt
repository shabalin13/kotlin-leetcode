package p15

class Solution {
    /*
    Brute force approach
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableSetOf<List<Int>>()
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                for (k in j + 1 until nums.size) {
                    if (nums[i] + nums[k] + nums[j] == 0) {
                        result.add(listOf(nums[i], nums[j], nums[k]).sorted())
                    }
                }
            }
        }
        return result.toList()
    }
     */

    /*
    My solution O(n^2)
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableSetOf<List<Int>>()

        val numToIds = mutableMapOf<Int, MutableList<Int>>()
        for (i in nums.indices) {
            numToIds.getOrPut(nums[i]) { mutableListOf() }.add(i)
        }

        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                val curSum = nums[i] + nums[j]

                val ids = numToIds[0 - curSum]
                if (ids != null) {
                    if (ids.size > 2 || (ids.size == 2 && nums[i] != 0 && nums[j] != 0) || (ids.size == 1 && ids[0] != i && ids[0] != j)) {
                        result.add(listOf(nums[i], nums[j], 0 - curSum).sorted())
                    }
                }
            }
        }
        return result.toList()
    }
     */

    /*
    With Set
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableSetOf<List<Int>>()
        nums.sort()

        for (i in 0 until nums.size) {
            var j = i + 1
            var k = nums.size - 1

            while (j < k) {
                val curSum = nums[i] + nums[j] + nums[k]

                if (curSum == 0) {
                    result.add(listOf(nums[i], nums[j], nums[k]))
                    j++
                } else if (curSum > 0) {
                    k--
                } else {
                    j++
                }
            }
        }

        return result.toList()
    }
     */

    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        nums.sort()

        for (i in 0 until nums.size) {
            if (i > 0 && nums[i - 1] == nums[i]) continue

            var j = i + 1
            var k = nums.size - 1

            while (j < k) {
                val curSum = nums[i] + nums[j] + nums[k]

                if (curSum == 0) {
                    result.add(listOf(nums[i], nums[j], nums[k]))
                    j++
                    while (nums[j - 1] == nums[j] && j < k) j++
                } else if (curSum > 0) {
                    k--
                } else {
                    j++
                }
            }
        }

        return result
    }
}
