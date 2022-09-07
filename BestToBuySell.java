class Solution {
    public int maxProfit(int[] prices) {
        // left pointer to buy
        int left = 0;
        
        // right pointer to sell
        int right = 1;
        
        // maximum profit
        int maxProfit = 0;
        
        while(right<prices.length){
            if(prices[left]<prices[right]){
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit,profit);
            }else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
