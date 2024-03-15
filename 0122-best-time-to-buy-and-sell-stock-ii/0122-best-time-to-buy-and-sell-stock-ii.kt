class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var buy = -1
        for (i in prices.indices) {
            if(i == prices.size-1) {
                if(buy != -1) profit += (prices[i] - buy)
                break
            }

            if(prices[i] < prices[i+1] && buy == -1) buy = prices[i]
            else if(prices[i] > prices[i+1] && buy != -1) {
                profit += (prices[i] - buy)
                buy = -1
            }
        }

        return profit
    }
}