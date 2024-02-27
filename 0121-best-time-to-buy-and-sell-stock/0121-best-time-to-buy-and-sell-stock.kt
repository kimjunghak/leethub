class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var minPrice = Int.MAX_VALUE

        prices.forEach {
            if (it < minPrice) minPrice = it
            else if (it - minPrice > maxProfit) maxProfit = it - minPrice
        }

        return maxProfit
    }
}