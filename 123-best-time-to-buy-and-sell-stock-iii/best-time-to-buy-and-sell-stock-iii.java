class Solution {
    public int maxProfit(int[] prices) {
        int buy1 = -prices[0], buy2 = -prices[0];
        int sell1 = 0, sell2 = 0;
        for(int i = 1;i < prices.length;i++){
            int buy = prices[i];
            buy1 = Math.max(buy1, -buy);
            sell1 = Math.max(sell1, buy1 + buy);
            buy2 = Math.max(buy2, sell1 - buy);
            sell2 = Math.max(sell2, buy2 + buy); 
        }
        return sell2;
    }
}