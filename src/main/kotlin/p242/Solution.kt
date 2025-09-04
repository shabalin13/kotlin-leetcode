package p242

class Solution {
    /*
    fun isAnagram(s: String, t: String): Boolean {
        return s.toCharArray().sorted() == t.toCharArray().sorted()
    }
     */

    fun isAnagram(s: String, t: String): Boolean {
        val sToCount = IntArray(26)
        val tToCount = IntArray(26)

        s.forEach { sToCount[it - 'a']++ }
        t.forEach { tToCount[it - 'a']++ }

        for (i in 0 until 26) {
            if (sToCount[i] != tToCount[i]) return false
        }
        return true
    }
}
