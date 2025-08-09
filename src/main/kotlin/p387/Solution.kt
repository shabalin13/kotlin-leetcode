package p387

class Solution {

    /* Using alphabet Array to store character frequencies */
    fun firstUniqChar(s: String): Int {
        val charCount = IntArray(26)
        for (char in s) {
            charCount[char - 'a']++
        }

        for (i in 0 until s.length) {
            if (charCount[s[i] - 'a'] == 1) {
                return i
            }
        }

        return -1
    }

    /*
    Using HashMap to store character frequencies
    fun firstUniqChar(s: String): Int {
        val charCount = hashMapOf<Char, Int>()
        for (char in s) {
            charCount[char] = charCount.getOrDefault(char, 0) + 1
        }

        for (i in 0 until s.length) {
            if (charCount[s[i]] == 1) {
                return i
            }
        }

        return -1
    }
     */
}
