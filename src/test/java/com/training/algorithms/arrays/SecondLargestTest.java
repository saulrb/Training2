package com.training.algorithms.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SecondLargestTest {

  private int [] array;
  private int secondLargest;
  @BeforeEach
  void setUp() {
      array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
      secondLargest = 8;
  }

  @Test
  void find() {
        assertEquals(SecondLargest.find(array), secondLargest);
  }

  @Test
  void find2() {
    assertEquals(SecondLargest.find2(array), secondLargest);
  }

}
