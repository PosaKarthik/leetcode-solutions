class Solution {
    public int maxProfit(int[] prices) {
        
        int minimum = prices[0];
        int maximumProfit = 0;

        for(int stock : prices ){

            if(stock > minimum){
                maximumProfit = Math.max(maximumProfit,stock - minimum);
            }

            minimum = Math.min(minimum,stock);
        }

        return maximumProfit;

    }
}