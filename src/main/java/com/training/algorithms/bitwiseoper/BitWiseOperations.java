package com.training.algorithms.bitwiseoper;

public class BitWiseOperations {

  public int rightShift(int i, int i1) {
    return (i >> i1);
  }

  public int leftShift(int i, int i1) {
    return (i << i1);
  }

  public int bitwiseAnd(int i, int i1) {
    return (i & i1);
  }

  public int bitwiseOr(int i, int i1) {
    return (i | i1);
  }

  public int bitwiseXor(int i, int i1) {
    return (i ^ i1);
  }

  public int bitwiseComplement(int i) {
    return (~i);
  }

  public int bitwiseLeftShift(int i, int i1) {
    return (i << i1);
  }

  public int bitwiseRightShift(int i, int i1) {
    return (i >> i1);
  }

  public int bitwiseZeroFillRightShift(int i, int i1) {
    return (i >>> i1);
  }
}
