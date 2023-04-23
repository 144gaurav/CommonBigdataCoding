package com.java.datastructure.leetcode;

import java.util.HashMap;
import java.util.Map;

public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {3,2,6,5,0,3,4,7};
        System.out.println(findMaxProfit(prices));
    }

    public static int findMaxProfit(int[] prices){
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0 ; i<prices.length ; i ++){
            if(minPrice > prices[i])
                minPrice = prices[i];
            else if(prices[i] - minPrice > profit)
                profit = prices[i] - minPrice;
        }
        return profit > 0 ? profit : 0;
    }
}



/** You are given an array prices where prices[i] is the price of a given stock on the ith day.

 You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

 Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



 Example 1:

 Input: prices = [7,1,5,3,6,4]
 Output: 5
 Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 Example 2:

 Input: prices = [7,6,4,3,1]
 Output: 0
 Explanation: In this case, no transactions are done and the max profit = 0.


 Constraints:

 1 <= prices.length <= 105
 0 <= prices[i] <= 104
 **/