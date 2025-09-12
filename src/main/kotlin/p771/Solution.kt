package p771

class Solution {
    /* O(N * M)
    fun numJewelsInStones(jewels: String, stones: String): Int {
        var numJewels = 0
        for (jewel in jewels) {
            for (stone in stones) {
                if (stone == jewel) numJewels++
            }
        }
        return numJewels
    }
     */

    /* O(N + M) */
    fun numJewelsInStones(jewels: String, stones: String): Int {
        val jewels = jewels.toSet()

        var numJewels = 0
        for (stone in stones) {
            if (stone in jewels) numJewels++
        }
        return numJewels
    }
}
