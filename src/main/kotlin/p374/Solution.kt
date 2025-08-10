package p374

class Solution : GuessGame() {
    override fun guessNumber(n: Int): Int {
        var left = 1
        var right = n
        while (left <= right) {
            val mid = left + (right - left) / 2
            val res = guess(mid)
            if (res == 0) return mid
            else if (res > 0) left = mid + 1
            else right = mid - 1
        }
        return n
    }
}
