package com.training.algorithms.bitwiseoper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BitWiseOperationsTest {

  BitWiseOperations bitWiseOperations;

  @BeforeEach
  void setUp() {
    bitWiseOperations = new BitWiseOperations();
  }

  @Test
  void testRightShift() {
    assertEquals(bitWiseOperations.rightShift(10, 1), 5);
    assertEquals(bitWiseOperations.rightShift(-8, 1), -4);
  }

  @Test
  void testLeftShift() {
    assertEquals(bitWiseOperations.leftShift(10, 1), 20);
    ;
  }

  @Test
  void testBitwiseAnd() {
    assertEquals(bitWiseOperations.bitwiseAnd(10, 1), 0);
  }

  @Test
  void testBitwiseOr() {
    assertEquals(bitWiseOperations.bitwiseOr(10, 1), 11);
  }

  @Test
  void testBitwiseXor() {
    assertEquals(bitWiseOperations.bitwiseXor(10, 1), 11);
  }

  @Test
  void testBitwiseComplement() {
    assertEquals(bitWiseOperations.bitwiseComplement(10), -11);
  }

  @Test
  void testBitwiseLeftShift() {
    assertEquals(bitWiseOperations.bitwiseLeftShift(10, 1), 20);
  }

  @Test
  void testBitwiseRightShift() {
    assertEquals(bitWiseOperations.bitwiseRightShift(10, 1), 5);
  }

  @Test
  void testBitwiseZeroFillRightShift() {
    assertEquals(bitWiseOperations.bitwiseZeroFillRightShift(10, 1), 5);
    assertEquals(bitWiseOperations.bitwiseZeroFillRightShift(-8, 1), 2147483644);
  }
}
