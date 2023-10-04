package com.training.algorithms.arrays;

public class TwoDimensionArray {

  public int maxGlassWatch(int[][] arr) {
    int top_row = 0;
    int middle_row = 0;
    int bottom_row = 0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length - 2; i++) {
      for (int j = 0; j < arr[i].length - 2; j++) {
        if (j == 0) {
          top_row = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
          middle_row = arr[i + 1][j + 1];
          bottom_row = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
        } else {
          top_row = top_row - arr[i][j - 1] + arr[i][j + 2];
          middle_row = arr[i + 1][j + 1];
          bottom_row = bottom_row - arr[i + 2][j - 1] + arr[i + 2][j + 2];
        }
        if (top_row + middle_row + bottom_row > max) {
          max = top_row + middle_row + bottom_row;
        }
      }
    }
    return max;
  }
}
