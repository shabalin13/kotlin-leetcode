package p59

class Solution {
    /*
    fun generateMatrix(n: Int): Array<IntArray> {
        val matrix = Array(n) { IntArray(n) }

        var num = 1
        for (i in 0 until n - 1) {
            for (j in i until n - i - 1) {
                var curNum = num
                matrix[i][j] = curNum
                curNum += (n - 2 * i - 1)
                matrix[j][n - i - 1] = curNum
                curNum += (n - 2 * i - 1)
                matrix[n - i - 1][n - j - 1] = curNum
                curNum += (n - 2 * i - 1)
                matrix[n - j - 1][i] = curNum
                num = if (j == n - i - 2) curNum + 1 else num + 1
            }
        }

        if (n % 2 != 0) matrix[n / 2][n / 2] = n * n
        return matrix
    }
     */

    fun generateMatrix(n: Int): Array<IntArray> {
        val matrix = Array(n) { IntArray(n) }

        var top = 0
        var bottom = n - 1
        var left = 0
        var right = n - 1

        var curNum = 1
        while (left <= right && top <= bottom) {
            for (i in left..right) {
                matrix[top][i] = curNum++
            }
            top++
            for (i in top..bottom) {
                matrix[i][right] = curNum++
            }
            right--
            for (i in right downTo left) {
                matrix[bottom][i] = curNum++
            }
            bottom--
            for (i in bottom downTo top) {
                matrix[i][left] = curNum++
            }
            left++
        }
        return matrix
    }
}
