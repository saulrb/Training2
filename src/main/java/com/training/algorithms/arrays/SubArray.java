package com.training.algorithms.arrays;

public class SubArray {

  public int countNegativeSubArrays(int[] array) {
    int negativeSubA = 0;
    for (int i = 0; i < array.length; i++) {
      int sum = 0;
      for (int j = i; j < array.length; j++) {
        sum = sum + array[j];
        if (sum < 0) {
          negativeSubA++;
        }
      }
    }
    return negativeSubA;
  }
}
