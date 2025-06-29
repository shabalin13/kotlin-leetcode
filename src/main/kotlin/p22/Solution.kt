package p22

class Solution {
    /*
    fun generateParenthesis(n: Int): List<String> {
        var curResult = listOf("(" to 1)
        for (i in 1 until 2 * n) {
            val newResult = mutableListOf<Pair<String, Int>>()
            for ((curString, wastedOpen) in curResult) {
                if (wastedOpen < n) {
                    newResult.add("$curString(" to wastedOpen + 1)
                }
                if (i - wastedOpen < wastedOpen) {
                    newResult.add("$curString)" to wastedOpen)
                }
            }
            curResult = newResult
        }
        return curResult.map { it.first }
    }
     */

    fun generateParenthesis(n: Int): List<String> {
        val result = mutableListOf<String>()

        fun backtrack(current: String, openN: Int, closedN: Int) {
            if (openN == closedN && closedN == n) {
                result.add(current)
                return
            }
            if (openN < n) {
                backtrack("$current(", openN + 1, closedN)
            }
            if (closedN < openN) {
                backtrack("$current)", openN, closedN + 1)
            }
        }
        backtrack("", 0, 0)
        return result
    }
}
