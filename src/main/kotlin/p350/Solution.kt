package p350

class Solution {
    /*
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val nums1Count = IntArray(1001)
        val nums2Count = IntArray(1001)

        nums1.forEach { nums1Count[it]++ }
        nums2.forEach { nums2Count[it]++ }

        val result = mutableListOf<Int>()
        for (num in 0..1000) {
            repeat(minOf(nums1Count[num], nums2Count[num])) {
                result.add(num)
            }
        }

        return result.toIntArray()
    }
     */

    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        // if (nums1.count < nums2.count)
        val nums1Count = IntArray(1001)
        nums1.forEach { nums1Count[it]++ }

        val result = mutableListOf<Int>()
        for (num in nums2) {
            if (nums1Count[num] > 0) {
                result.add(num)
                nums1Count[num]--
            }
        }

        return result.toIntArray()
    }
}
