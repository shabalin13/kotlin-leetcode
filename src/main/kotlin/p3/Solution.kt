package p3

import kotlin.math.max

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var (l, r) = Pair(0, 0)
        val charToIdx = mutableMapOf<Char, Int>()
        var result = 0

        while (r != s.length) {
            val curChar = s[r]
            val curCharIdx = charToIdx[curChar]
            if (curCharIdx != null && curCharIdx >= l) {
                l = curCharIdx + 1
            }
            charToIdx[curChar] = r
            result = max(result, r - l + 1)
            r++
        }
        return result
    }

    /*
    fun lengthOfLongestSubstring(s: String): Int {
        var result = 0
        for (i in 0 until s.length) {
            for (j in i until s.length) {
                val allChars = s.slice(i..j).toSet()
                if (allChars.size == j - i + 1) {
                    result = maxOf(result, j - i + 1)
                }
            }
        }
        return result
    }
     */
}
