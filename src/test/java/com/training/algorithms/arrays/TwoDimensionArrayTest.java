package com.training.algorithms.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoDimensionArrayTest {

  TwoDimensionArray twoDimensionArray;

  @BeforeEach
  void setUp() {
    twoDimensionArray = new TwoDimensionArray();
  }

  @Test
  void testMaxGlassWatch() {
    int[][] arr = {
      {1, 1, 1, 0, 0, 0},
      {0, 1, 0, 0, 0, 0},
      {1, 1, 1, 0, 0, 0},
      {0, 0, 2, 4, 4, 0},
      {0, 0, 0, 2, 0, 0},
      {0, 0, 1, 2, 4, 0}
    };
    assertEquals(19, twoDimensionArray.maxGlassWatch(arr));
  }
}
