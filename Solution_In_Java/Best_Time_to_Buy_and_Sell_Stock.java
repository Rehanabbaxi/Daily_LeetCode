/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lc_solutions_in_java;

public class Best_Time_to_Buy_and_Sell_Stock {
    
        public int maxProfit(int[] prices) {
        int Max = 0; 
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices){
            if(price < minPrice ){
                minPrice = price ;
            }
            else {
                Max = Math.max(Max , price - minPrice );
            }
        }
        return Max ;
    }
        public static void main(String[] args) {
            Best_Time_to_Buy_and_Sell_Stock obj = new Best_Time_to_Buy_and_Sell_Stock();
            
            int[] test_prices = new int[]{7,1,5,3,6,4} ;
            int result = obj.maxProfit(test_prices);
            System.out.println("Max profit is : " + result );
    }
}
