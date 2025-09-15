package p121

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var minBuyPrice = Int.MAX_VALUE
        for (price in prices) {
            profit = maxOf(price - minBuyPrice, profit)
            minBuyPrice = minOf(minBuyPrice, price)
        }
        return profit
    }
}
