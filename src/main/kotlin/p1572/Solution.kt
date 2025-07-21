package p1572

class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        val n = mat.size
        var result = 0

        for (i in 0 until n) {
            result += mat[i][i] + mat[n - i - 1][i]
        }

        if (n % 2 != 0) result -= mat[n / 2][n / 2]
        return result
    }
}
