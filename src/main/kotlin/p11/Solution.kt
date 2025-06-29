package p11

class Solution {
    /*
    Brute force approach
    fun maxArea(height: IntArray): Int {
        var result = 0
        for (i in 0 until height.size) {
            for (j in i + 1 until height.size) {
                result = maxOf(result, minOf(height[i], height[j]) * (j - i))
            }
        }
        return result
    }
     */

    fun maxArea(height: IntArray): Int {
        var (l, r) = 0 to height.lastIndex
        var result = 0
        while (l < r) {
            result = maxOf(result, (r - l) * minOf(height[l], height[r]))
            if (height[l] > height[r]) r-- else l++
        }
        return result
    }
}
