package p238

class Solution {

    /* Without extra space */
    fun productExceptSelf(nums: IntArray): IntArray {
        val products = IntArray(nums.size) { 1 }

        var prefixProduct = 1
        for (i in 0 until nums.size) {
            products[i] = prefixProduct * products[i]
            prefixProduct *= nums[i]
        }

        var suffixProduct = 1
        for (i in nums.size - 1 downTo 0) {
            products[i] = suffixProduct * products[i]
            suffixProduct *= nums[i]
        }

        return products
    }

    /*
    With extra space (prefix and suffix arrays)
    fun productExceptSelf(nums: IntArray): IntArray {
        val leftToRightProducts = IntArray(nums.size) { 1 }
        for (i in 1 until nums.size) {
            leftToRightProducts[i] = leftToRightProducts[i - 1] * nums[i - 1]
        }

        val rightToLeftProducts = IntArray(nums.size) { 1 }
        for (i in nums.size - 2 downTo 0) {
            rightToLeftProducts[i] = rightToLeftProducts[i + 1] * nums[i + 1]
        }

        val products = leftToRightProducts
        for (i in 0 until products.size) {
            products[i] *= rightToLeftProducts[i]
        }

        return products
    }
     */
}
