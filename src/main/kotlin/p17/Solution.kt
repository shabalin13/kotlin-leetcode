package p17

class Solution {
    val digitToLetters = mapOf(
        '2' to listOf("a", "b", "c"),
        '3' to listOf("d", "e", "f"),
        '4' to listOf("g", "h", "i"),
        '5' to listOf("j", "k", "l"),
        '6' to listOf("m", "n", "o"),
        '7' to listOf("p", "q", "r", "s"),
        '8' to listOf("t", "u", "v"),
        '9' to listOf("w", "x", "y", "z"),
    )

    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) return emptyList()
        val result = mutableListOf<String>()

        fun backtrack(current: String, index: Int) {
            if (index == digits.length) {
                result.add(current)
                return
            } else {
                for (letter in digitToLetters[digits[index]]!!) {
                    backtrack("$current$letter", index + 1)
                }
            }
        }

        backtrack("", 0)
        return result
    }
}
