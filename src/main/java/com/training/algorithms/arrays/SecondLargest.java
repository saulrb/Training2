package com.training.algorithms.arrays;

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
}
