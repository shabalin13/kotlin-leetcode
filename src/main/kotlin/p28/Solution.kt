package p28

class Solution {
    /*
    fun strStr(haystack: String, needle: String): Int = haystack.indexOf(needle)
     */

    fun strStr(haystack: String, needle: String): Int {
        val n = needle.length - 1
        var i = 0

        while (i + n < haystack.length) {
            if (haystack.slice(i..i + n) == needle) {
                return i
            }
            i++
        }

        return -1
    }
}
