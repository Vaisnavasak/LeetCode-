class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        mini = prices[0]
        profit = 0
        for i in range (0,len(prices)):
            if (prices[i] < mini):
                mini = prices[i]
            elif (prices[i] - mini > profit):
                profit = prices[i] - mini
        return profit

        