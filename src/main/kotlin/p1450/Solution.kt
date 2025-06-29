package p1450

class Solution {
    fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
        var result = 0
        for (i in startTime.indices) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) result++
        }
        return result
    }

    /*
    fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
        return startTime.zip(endTime).count { it.first <= queryTime && it.second >= queryTime}
    }
     */
}
