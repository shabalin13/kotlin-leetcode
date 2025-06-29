package p1446

import kotlin.math.max

class Solution {
    fun maxPower(s: String): Int {
        var result = 1
        var current = 1
        var prevChar = s[0]
        for (i in 1 until s.length) {
            if (s[i] == prevChar) {
                current++
            } else {
                current = 1
            }
            result = max(result, current)
            prevChar = s[i]
        }
        return result
    }
}
