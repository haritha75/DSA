/* You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 
 * 
 */

class Solution {
    public int maxProfit(int[] prices) {

        int max=0;
        if(prices.length==1)
           return 0;

        int left=0;   

        for(int right=1;right<prices.length;right++) {
            if(prices[right] > prices[left]) {
                int curr= prices[right]-prices[left];
                max=Math.max(max,curr);
            }
            else {
                left = right;
            }
        }
        return max;
        
    }
}