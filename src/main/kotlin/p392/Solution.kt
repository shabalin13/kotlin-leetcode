package p392

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var sIdx = 0
        var tIdx = 0

        while (sIdx < s.length && tIdx < t.length) {
            if (s[sIdx] == t[tIdx]) sIdx++
            tIdx++
        }

        return sIdx == s.length
    }

    /*
    Stupid solution
    fun isSubsequence(s: String, t: String): Boolean {
        var j = 0
        for (i in 0 until s.length) {
            while (j < t.length && s[i] != t[j]) j++
            if (j == t.length) return false
            else if (s[i] == t[j]) j++
        }
        return true
    }
     */
}
