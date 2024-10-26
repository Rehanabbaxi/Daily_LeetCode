/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lc_solutions_in_java;


public class Remove_Element {
  
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right  ;
        for (right = 0 ; right< nums.length ; right++){
            if(nums[right] != val){
                nums[left] = nums[right];
                left++ ; 
            }
        }
        return left ;
        }
        
    
    public static void main(String[] args) {
        Remove_Element obj = new Remove_Element();
        
        int[] test_num = new int[]{0,1,2,2,3,0,4,2};
        int test_val = 2 ; 
        
       int result  =   obj.removeElement(test_num, test_val);
        System.out.println("output  : " + result);
    }
}
