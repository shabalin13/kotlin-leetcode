package p438

class Solution {
    /* Optimized solution */
    fun findAnagrams(s: String, p: String): List<Int> {
        if (s.length < p.length) return emptyList()

        val charCount = IntArray(26)
        p.forEach { charCount[it - 'a']++ }

        val result = mutableListOf<Int>()

        var left = 0
        for (right in 0 until s.length) {
            charCount[s[right] - 'a']--
            if (right - left + 1 < p.length) continue
            if (charCount.all { it == 0 }) result.add(left)
            charCount[s[left++] - 'a']++
        }

        return result
    }

    /*
    Stupid solution
    fun findAnagrams(s: String, p: String): List<Int> {
        if (s.length < p.length) return emptyList()

        val charCount = IntArray(26)
        p.forEach { charCount[it - 'a']++ }

        val result = mutableListOf<Int>()
        var left = 0
        var right = 0
        while (right < p.length) {
            charCount[s[right++] - 'a']--
        }

        while (right < s.length) {
            if (charCount.all { it == 0 }) {
                result.add(left)
            }
            charCount[s[left++] - 'a']++
            charCount[s[right++] - 'a']--
        }

        if (charCount.all { it == 0 }) {
            result.add(left)
        }

        return result
    }
     */
}
