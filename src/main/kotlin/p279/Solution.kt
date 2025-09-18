package p279

class Solution {
    /* O(N * sqrt(N)) */
    fun numSquares(n: Int): Int {
        val dp = IntArray(n + 1) { n }
        dp[0] = 0

        for (num in 1..n) {
            for (s in 1..num) {
                val square = s * s
                if (num < square) break
                dp[num] = minOf(dp[num], dp[num - square] + 1)
            }
        }

        return dp[n]
    }
}
