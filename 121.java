class Solution {
    public int maxProfit(int[] prices) {
        int profit = -1;
        int min = prices[0] ;
        for(int i=0; i<prices.length;i++)
        {
            profit=Math.max(profit,prices[i]-min);
            min=Math.min(prices[i],min);
        }
        return profit;
    }
}
