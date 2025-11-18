package p717

class Solution {
    /*
    fun isOneBitCharacter(bits: IntArray): Boolean {
        var isOneAvailable = false
        for (i in 0 until bits.size - 1) {
            if (isOneAvailable) isOneAvailable = false
            else if (bits[i] == 1) isOneAvailable = true
        }
        return !isOneAvailable && bits.last() == 0
    }
     */

    fun isOneBitCharacter(bits: IntArray): Boolean {
        var i = 0
        while (i < bits.size - 1) {
            i += bits[i] + 1
        }
        return i == bits.size - 1
    }
}
