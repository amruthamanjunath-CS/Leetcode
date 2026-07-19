class Solution {
    public int maxProfit(int[] prices) {
         int smallest=0;
         int maxProfit=0;
         int diff=0;
         for(int i=0;i<prices.length;i++){
            if (prices[i]<prices[smallest]){
                smallest=i;
            }
            else{
                if(prices[i]-prices[smallest]>maxProfit){
                maxProfit=prices[i]-prices[smallest];
                }
                
            }
         }
         return maxProfit;
    }
}