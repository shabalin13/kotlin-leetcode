package p974

class Solution {
    /*
    Stupid solution
    fun subarraysDivByK(nums: IntArray, k: Int): Int {
        var sum = 0
        val prefixSums = mutableListOf<Int>(0)
        nums.forEach {
            sum += it
            prefixSums.add(sum)
        }

        var result = 0
        for (i in 1 until prefixSums.size) {
            for (j in 0 until i) {
                if ((prefixSums[i] - prefixSums[j]) % k == 0) result++
            }
        }
        return result
    }
     */

    fun subarraysDivByK(nums: IntArray, k: Int): Int {
        var sum = 0
        val modsCount = IntArray(k)
        modsCount[0] = 1
        var result = 0

        for (num in nums) {
            sum += num
            val mod = (sum % k + k) % k
//            var mod = sum % k
//            if (mod < 0) mod += k

            result += modsCount[mod]
            modsCount[mod] += 1
        }

        return result
    }
}
