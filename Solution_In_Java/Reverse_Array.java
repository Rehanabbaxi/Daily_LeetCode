/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;
import java.util.Arrays;

public class Reverse_Array {

    public void Array_reverse(int[] array){
        int left = 0;
        int right = array.length - 1;
        while(left <= right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
    
    public static void main(String[] args) {
        
        // instantiating class 
        Reverse_Array obj = new Reverse_Array();
        // initialising array 
        int[] test_array = new int[]{1 ,2 ,3 ,4 ,5 , 6};
  
        System.out.println("Array before reverse "+Arrays.toString(test_array));
        obj.Array_reverse(test_array);
        System.out.println("Array after reverse "+Arrays.toString(test_array));
    }
}
