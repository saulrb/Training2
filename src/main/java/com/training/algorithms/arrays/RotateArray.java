package com.training.algorithms.arrays;

import java.util.Arrays;

public class RotateArray {

    public void rotate(int[] array, int k) {
        for(int i = 0; i < k; i++){
            int end = array[array.length-1];
            for(int j = array.length-1; j > 0 ; j--){
                array[j] = array[j-1];
            }
            array[0] = end;
        }
        Arrays.stream(array).forEach(System.out::print);
    }
}
