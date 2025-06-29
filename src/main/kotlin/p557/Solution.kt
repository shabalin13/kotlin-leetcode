package p557

class Solution {
    fun reverseWords(s: String): String {
        return s.split(" ").joinToString(" ") { it.reversed() }
    }

    /*
    Approach without helper functions
    fun reverseWords(s: String): String {
        val res = s.toCharArray()
        val len = s.length
        var lastSpaceIndex = -1

        for (i in 0..len) {
            if (i == len || s[i] == ' ') {
                var start = lastSpaceIndex + 1
                var end = i - 1

                while (start < end) {
                    val t = res[start]
                    res[start++] = res[end]
                    res[end--] = t
                }

                lastSpaceIndex = i
            }
        }

        return String(res)
    }
     */
}
