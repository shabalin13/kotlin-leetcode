package p326

class Solution {
    /*
    Solution with loop O(logN)
    fun isPowerOfThree(n: Int): Boolean {
        if (n <= 0) return false
        var num = n.toDouble()
        while (num >= 3) {
            num /= 3
        }
        return num == 1.0
    }
     */

    /*
    Solution with recursion O(logN)
    fun isPowerOfThree(n: Int): Boolean {
        fun helper(n: Double): Boolean {
            if (n <= 0) return false
            return if (n >= 3) helper(n / 3.0) else n == 1.0
        }
        return helper(n.toDouble())
    }
     */

    /*
    Special solution O(1)
    1162261467 is the maximum 3^i <= 2^31-1
     */
    fun isPowerOfThree(n: Int): Boolean = n > 0 && 1162261467 % n == 0
}
