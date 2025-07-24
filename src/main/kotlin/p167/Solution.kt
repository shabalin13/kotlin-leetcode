package p167

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size - 1
        while (left < right) {
            val sum = numbers[left] + numbers[right]
            if (sum == target) return intArrayOf(left + 1, right + 1)
            if (sum < target) left++ else right--
        }
        return intArrayOf(left, right)
    }

    /*
    Binary Search O(nlogn)
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        fun find(target: Int, start: Int, end: Int): Int? {
            var left = start - 1
            var right = end + 1
            while (left + 1 < right) {
                val mid = (left + right) / 2
                if (numbers[mid] >= target) {
                    right = mid
                } else {
                    left = mid
                }
            }
            return if (right == end + 1) null else right
        }

        for (i in 0 until numbers.size - 1) {
            val j = find(target - numbers[i], i + 1, numbers.size - 1)
            if (j != null && numbers[i] + numbers[j] == target) {
                return intArrayOf(i + 1, j + 1)
            }
        }

        return intArrayOf()
    }*/
}
