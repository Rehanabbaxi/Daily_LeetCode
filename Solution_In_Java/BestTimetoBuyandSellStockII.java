/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lc_solutions_in_java;


public class BestTimetoBuyandSellStockII {
    
       public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int n = prices.length ;
        int maxProfit = 0;
        for(int i = 0; i < n ; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            else{
                maxProfit += prices[i]-min;
                min = prices[i];
            }
        }
        return maxProfit;
    } 
    public static void main(String[] args) {
        BestTimetoBuyandSellStockII obj = new BestTimetoBuyandSellStockII();
        int[] test_prices = {7,1,5,3,6,4};
        int maxProfit = obj.maxProfit(test_prices);
        System.out.println("Max profit value is " + maxProfit);
    }
}
