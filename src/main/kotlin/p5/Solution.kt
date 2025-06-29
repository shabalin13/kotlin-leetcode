package p5

class Solution {
    /*
    Brute force approach
    fun longestPalindrome(s: String): String {
        var result = 0
        var answer = ""
        for (i in 0 until s.length) {
            for (j in i until s.length) {
                val tempS = s.slice(i..j)
                if (tempS == tempS.reversed() && result < j - i + 1) {
                    result = j - i + 1
                    answer = tempS
                }
            }
        }
        return answer
    }
     */

    /*
    Approach with set (to slow)
    fun longestPalindrome(s: String): String {
        data class Interval(val start: Int, val end: Int)

        var answer = Interval(0, 0)
        val allPalindromes = mutableSetOf<Interval>()
        for (j in 0 until s.length) {
            for (i in 0..j) {
                if (i == j) allPalindromes.add(Interval(i, j))
                else if (i == j - 1 && s[i] == s[j]) allPalindromes.add(Interval(i, j))
                else if (s[i] == s[j] && Interval(i + 1, j - 1) in allPalindromes) allPalindromes.add(Interval(i, j))

                answer =
                    if (Interval(i, j) in allPalindromes && answer.end - answer.start < j - i) Interval(
                        i,
                        j
                    ) else answer
            }
        }
        return s.slice(answer.start..answer.end)
    }
     */

    /*
    To weird for loops
    fun longestPalindrome(s: String): String {
        val isPalindrome = Array(s.length) { Array(s.length) { false } }
        var (answerI, answerJ) = 0 to 0

        for (j in 0 until s.length) {
            for (i in 0..j) {
                if (i == j) isPalindrome[i][j] = true
                else if (i == j - 1 && s[i] == s[j]) isPalindrome[i][j] = true
                else if (s[i] == s[j] && isPalindrome[i + 1][j - 1]) isPalindrome[i][j] = true

                if (isPalindrome[i][j] && answerJ - answerI < j - i) {
                    answerI = i
                    answerJ = j
                }
            }
        }
        return s.slice(answerI..answerJ)
    }
     */

    fun longestPalindrome(s: String): String {
        val isPalindrome = Array(s.length) { Array(s.length) { false } }
        var (answerI, answerJ) = 0 to 0

        for (length in 1..s.length) {
            for (i in 0..s.length - length) {
                val j = i + length - 1
                if (i == j) isPalindrome[i][j] = true
                else if (i == j - 1 && s[i] == s[j]) isPalindrome[i][j] = true
                else if (s[i] == s[j] && isPalindrome[i + 1][j - 1]) isPalindrome[i][j] = true

                if (isPalindrome[i][j] && answerJ - answerI < j - i) {
                    answerI = i
                    answerJ = j
                }
            }
        }
        return s.slice(answerI..answerJ)
    }
}
