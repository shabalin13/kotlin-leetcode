package p443

class Solution {
    fun compress(chars: CharArray): Int {
        var idx = 0

        var prevChar = chars[idx]
        var prevCharCount = 1
        for (i in 1 until chars.size) {
            if (chars[i] == prevChar) {
                prevCharCount++
            } else {
                chars[idx++] = prevChar
                if (prevCharCount > 1) {
                    for (char in prevCharCount.toString()) {
                        chars[idx++] = char
                    }
                }
                prevChar = chars[i]
                prevCharCount = 1
            }
        }

        chars[idx++] = prevChar
        if (prevCharCount > 1) {
            for (char in prevCharCount.toString()) {
                chars[idx++] = char
            }
        }

        return idx
    }
}
