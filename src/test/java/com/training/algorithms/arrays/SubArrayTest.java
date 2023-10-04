package com.training.algorithms.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubArrayTest {

  SubArray subArray;

  @BeforeEach
  void setUp() {
    subArray = new SubArray();
  }

  @Test
  void testNegativeSubArraysCount() {
    int[] array = {1, -2, 4, -5, 1};
    int total = subArray.countNegativeSubArrays(array);
    assertEquals(9, total);
  }

  @Test
  void test100NegativeSubArrayCount() {
    int[] array = {
      -463, -744, -589, -405, -321, -427, -164, -581, -613, -468, -246, -685, -869, -966, -889,
      -217, -712, -888, -251, -859, -969, -582, -603, -658, -49, -973, -185, -241, -439, -511, -479,
      -902, -255, -420, -660, -576, -848, -824, -157, -461, -644, -404, -498, -513, -722, -387, -82,
      -434, -275, -686, -645, -597, -268, -248, -255, -669, -573, -792, -910, -364, -303, -742,
      -267, -910, -162, -279, -487, -362, -103, -644, -823, -747, -400, -674, -612, -474, -61, -46,
      -260, -689, -732, -905, -286, -353, -505, -893, -22, -78, -37, -285, -443, -341, -27, -62,
      -603, -541, -341, -90, -904, -796
    };
    int total = subArray.countNegativeSubArrays(array);
    assertEquals(5050, total);
  }
}
