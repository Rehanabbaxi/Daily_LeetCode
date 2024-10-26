/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lc_solutions_in_java;


import java.util.Arrays;

public class Merge_Sorted_Array {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0 ; i < m ; i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
        return nums1;
    }

    public static void main(String[] args) {
        int[] test_num1 = new int[] {1,2,3,0,0,0};
        int[] test_num2 = new int[] {2,5,6};

        int test_m = 3 ;
        int test_n = 3 ;

        Merge_Sorted_Array obj = new Merge_Sorted_Array();
        int[] result = obj.merge(test_num1, test_m, test_num2, test_n);
        System.out.println(Arrays.toString(result));
    }
}
