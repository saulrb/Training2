package com.training.algorithms.arrays;

import java.util.Arrays;

public class SecondLargest {
  public static int find(int[] array) {
    int largest = array[0];
    int secondLargest = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] > largest) {
        secondLargest = largest;
        largest = array[i];
      } else if (array[i] > secondLargest && array[i] != largest) {
        secondLargest = array[i];
      }
    }

    return secondLargest;
  }

  public static int find2(int[] array) {
    Arrays.sort(array);
    return array[array.length - 2];
  }
}
