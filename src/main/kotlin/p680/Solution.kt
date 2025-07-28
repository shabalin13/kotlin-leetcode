package p680

class Solution {
    fun validPalindrome(s: String): Boolean {
        var l = 0
        var r = s.length - 1
        while (l < r) {
            if (s[l] != s[r]) {
                return isPalindrome(s, l, r - 1) || isPalindrome(s, l + 1, r)
            }
            l++
            r--
        }
        return true
    }

    fun isPalindrome(s: String, left: Int, right: Int): Boolean {
        var l = left
        var r = right
        while (l < r) {
            if (s[l] != s[r]) return false
            l++
            r--
        }
        return true
    }
}
