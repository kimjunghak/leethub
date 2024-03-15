class Solution {
    fun maxProfit(prices: IntArray): Int {
        var result = 0
        for (i in 0..<prices.size-1) {
            val profit = prices[i+1] - prices[i]
            if(profit > 0) result += profit
        }

        return result
    }
}