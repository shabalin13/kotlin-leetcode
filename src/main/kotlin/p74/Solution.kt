package p74

class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var l = -1
        var r = matrix.size

        while (r > l + 1) {
            val mid = (l + r) / 2
            if (matrix[mid][0] > target) {
                r = mid
            } else {
                l = mid
            }
        }

        if (l == -1) return false
        val i = l

        l = -1
        r = matrix[i].size

        while (r > l + 1) {
            val mid = (l + r) / 2
            if (matrix[i][mid] > target) {
                r = mid
            } else {
                l = mid
            }
        }

        val j = l
        return matrix[i][j] == target
    }
}
