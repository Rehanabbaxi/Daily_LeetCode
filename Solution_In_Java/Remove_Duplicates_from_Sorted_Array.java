/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lc_solutions_in_java;

public class Remove_Duplicates_from_Sorted_Array {
    
       public int removeDuplicates(int[] nums) {
        int right;
        int left = 1 ; 

        for(right = 1 ; right < nums.length ; right ++){
            if(nums[right] != nums[right-1]){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
       
    public static void main(String[] args) {
        Remove_Duplicates_from_Sorted_Array obj = new Remove_Duplicates_from_Sorted_Array();
        
        int[] test_nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int result = obj.removeDuplicates(test_nums);
        System.out.println("Number of unique elements is " +result);
        
        
    }
}
