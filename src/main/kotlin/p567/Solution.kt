package p567

class Solution {
    /*
    Optimized brute force
    fun checkInclusion(s1: String, s2: String): Boolean {
        var s1 = s1.toList().sorted()
        var s2 = s2.toList()

        var left = 0
        var right = s1.size - 1

        while (right < s2.size) {
            if (s2.slice(left..right).sorted() == s1) return true
            left++
            right++
        }

        return false
    }
     */

    /*
    Not bad
    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) return false
        var left = 0
        var right = s1.length - 1

        val s1CharsCount = ('a'..'z').associateWith { 0 }.toMutableMap()
        s1.forEach {
            s1CharsCount[it] = s1CharsCount[it]!! + 1
        }

        val s2CharsCount = ('a'..'z').associateWith { 0 }.toMutableMap()
        for (i in left until right) {
            s2CharsCount[s2[i]] = s2CharsCount[s2[i]]!! + 1
        }

        while (right < s2.length) {
            s2CharsCount[s2[right]] = s2CharsCount[s2[right]]!! + 1
            if (s1CharsCount == s2CharsCount) return true
            s2CharsCount[s2[left]] = s2CharsCount[s2[left]]!! - 1
            left++
            right++
        }

        return false
    }
     */

    /*
    Very good
    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) return false

        val s1CharsCount = IntArray(26)
        val s2CharsCount = IntArray(26)
        for (i in s1.indices) {
            s1CharsCount[s1[i] - 'a']++
            s2CharsCount[s2[i] - 'a']++
        }

        var left = 0
        var right = s1.length - 1
        while (right < s2.length - 1) {
            if (s1CharsCount.contentEquals(s2CharsCount)) return true
            s2CharsCount[s2[left] - 'a']--
            left++
            right++
            s2CharsCount[s2[right] - 'a']++
        }

        return s1CharsCount.contentEquals(s2CharsCount)
    }
     */

    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) return false

        val s1CharsCount = IntArray(26)
        val s2CharsCount = IntArray(26)
        for (i in s1.indices) {
            s1CharsCount[s1[i] - 'a']++
            s2CharsCount[s2[i] - 'a']++
        }

        var count = 0
        for (i in s1CharsCount.indices) {
            if (s1CharsCount[i] == s2CharsCount[i]) count++
        }

        var left = 0
        var right = s1.length - 1
        while (right < s2.length - 1) {
            if (count == 26) return true

            right++
            val r = s2[right] - 'a'
            s2CharsCount[r]++
            if (s2CharsCount[r] == s1CharsCount[r]) count++
            else if (s2CharsCount[r] == s1CharsCount[r] + 1) count--

            val l = s2[left] - 'a'
            s2CharsCount[l]--
            if (s2CharsCount[l] == s1CharsCount[l]) count++
            else if (s2CharsCount[l] == s1CharsCount[l] - 1) count--
            left++
        }

        return count == 26
    }
}
