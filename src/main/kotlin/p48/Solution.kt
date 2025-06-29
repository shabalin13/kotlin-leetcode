package p48

class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        val size = matrix.size
        for (i in 0 until size - 1) {
            for (j in i until size - i - 1) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[size - j - 1][i]
                matrix[size - j - 1][i] = matrix[size - i - 1][size - j - 1]
                matrix[size - i - 1][size - j - 1] = matrix[j][size - i - 1]
                matrix[j][size - i - 1] = temp
            }
        }
    }

    /*
    fun rotate(matrix: Array<IntArray>): Unit {
        val size = matrix.size
        for (i in 0 until size - 1) {
            for (j in i until size - i - 1) {
                var temp1 = matrix[i][j]
                var temp2 = matrix[j][size - i - 1]
                var temp3 = matrix[size - i - 1][size - j - 1]
                var temp4 = matrix[size - j - 1][i]
                val temp = temp1
                temp1 = temp4
                temp4 = temp3
                temp3 = temp2
                temp2 = temp
            }
        }
    }
     */
}
