package p986

import kotlin.math.max
import kotlin.math.min

class Solution {
    /*
    fun intervalIntersection(firstList: Array<IntArray>, secondList: Array<IntArray>): Array<IntArray> {
        var (i, j) = 0 to 0
        val result = mutableListOf<IntArray>()

        while (i < firstList.size && j < secondList.size) {
            val (startI, endI) = firstList[i]
            val (startJ, endJ) = secondList[j]
            val (startK, endK) = max(startI, startJ) to min(endI, endJ)
            if (startK <= endK) {
                result.add(intArrayOf(startK, endK))
            }
            if (endI < endJ) {
                i++
            } else {
                j++
            }
        }
        return result.toTypedArray()
    }
     */

    fun intervalIntersection(firstList: Array<IntArray>, secondList: Array<IntArray>): Array<IntArray> {
        var (i, j) = 0 to 0
        val result = mutableListOf<IntArray>()

        while (i < firstList.size && j < secondList.size) {
            val (startI, endI) = firstList[i]
            val (startJ, endJ) = secondList[j]
            if (startI > endJ) {
                j++
            } else if (startJ > endI) {
                i++
            } else {
                val (startK, endK) = max(startI, startJ) to min(endI, endJ)
                result.add(intArrayOf(startK, endK))
                if (endI < endJ) i++ else j++
            }
        }

        return result.toTypedArray()
    }
}
