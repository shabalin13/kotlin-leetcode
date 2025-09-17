package p763

class Solution {
    /* Two pointers */
    fun partitionLabels(s: String): List<Int> {
        val lastCharIds = IntArray(26) { -1 }
        for (i in s.indices) {
            lastCharIds[s[i] - 'a'] = i
        }

        val result = mutableListOf<Int>()
        var partitionStart = 0
        var partitionEnd = 0
        for (i in s.indices) {
            partitionEnd = maxOf(partitionEnd, lastCharIds[s[i] - 'a'])
            if (i == partitionEnd) {
                result.add(partitionEnd - partitionStart + 1)
                partitionStart = i + 1
            }
        }

        return result
    }
}
