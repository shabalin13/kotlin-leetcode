package p56

class Solution {
    /*
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortBy { it[0] }

        val result = mutableListOf(intervals[0])

        for (i in 1 until intervals.size) {
            val (start, end) = intervals[i]
            val (prevStart, prevEnd) = result.last()
            if (prevEnd >= start) {
                result[result.lastIndex] = intArrayOf(prevStart, maxOf(prevEnd, end))
            } else {
                result.add(intervals[i])
            }
        }

        return result.toTypedArray()
    }
     */

    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortBy { it[0] }

        val result = mutableListOf(intervals[0])

        for (i in 1 until intervals.size) {
            if (result[result.lastIndex][1] >= intervals[i][0]) {
                result[result.lastIndex][1] = maxOf(result[result.lastIndex][1], intervals[i][1])
            } else {
                result.add(intervals[i])
            }
        }

        return result.toTypedArray()
    }
}
