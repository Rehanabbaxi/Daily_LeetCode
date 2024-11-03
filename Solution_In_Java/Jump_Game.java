/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lc_solutions_in_java;

public class Jump_Game {
    
    public boolean canJump(int[] nums) {
        int max_jump = 0 ;
        int n = nums.length ; 
        for (int i = 0 ; i < n  ; i++){
            if(i > max_jump){
                return false;
            }
            max_jump = Math.max(max_jump , i+nums[i]);
            if(max_jump >= n-1){
                return true ;
            }
        }
        return false;   
    }
    
    public static void main(String[] args) {
        Jump_Game obj = new Jump_Game();
        int[] test_nums = {3,2,1,0,4}; 
        boolean result = obj.canJump(test_nums);
        System.out.println("Can  jump to last index : " + result);
    }
}
