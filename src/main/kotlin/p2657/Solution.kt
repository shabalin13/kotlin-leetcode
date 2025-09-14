package p2657

class Solution {
    fun findThePrefixCommonArray(A: IntArray, B: IntArray): IntArray {
        val n = A.size
        val countArray = IntArray(n + 1) { 0 }
        var count = 0
        val C = IntArray(n) { 0 }
        for (i in 0 until n) {
            countArray[A[i]]++
            if (countArray[A[i]] > 1) count++
            countArray[B[i]]++
            if (countArray[B[i]] > 1) count++
            C[i] = count
        }
        return C
    }
}
