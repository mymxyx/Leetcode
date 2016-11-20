public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int buyPrice = prices[0];
        int sellPrice = prices[0];
        int max = 0;
        for(int i =0;i<prices.length;i++){
            int currentPrice = prices[i];
            if(currentPrice>sellPrice){
                sellPrice = currentPrice;
            }
            if(currentPrice<buyPrice){
                buyPrice = currentPrice;
                sellPrice = currentPrice;
            }
            if((sellPrice-buyPrice)>max){
                max = sellPrice-buyPrice;
            }
        }
        return max;
        
    }
}
