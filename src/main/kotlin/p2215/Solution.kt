package p2215

class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val nums1Set = nums1.toSet()
        val nums2Set = nums2.toSet()
        return listOf((nums1Set - nums2Set).toList(), (nums2Set - nums1Set).toList())
//        return listOf(nums1Set.subtract(nums2Set).toList(), nums2Set.subtract(nums1Set).toList())
    }

    /*
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
         val nums1Set = nums1.toSet()
         val nums2Set = nums2.toSet()
         val nums1Distinct = mutableListOf<Int>()
         val nums2Distinct = mutableListOf<Int>()

         for (num in nums2Set) {
             if (num !in nums1Set) nums2Distinct.add(num)
         }

         for (num in nums1Set) {
             if (num !in nums2Set) nums1Distinct.add(num)
         }

         return listOf(nums1Distinct, nums2Distinct)
     }
      */
}
