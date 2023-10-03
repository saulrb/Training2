package com.training.algorithms.bignumber;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

public class BigDecimalExample {

  public String[] sort(String[] s) {
    Arrays.sort(
        s,
        0,
        s.length,
        new Comparator<Object>() {
          public int compare(Object s1, Object s2) {
            BigDecimal b1 = new BigDecimal((String) s1);
            BigDecimal b2 = new BigDecimal((String) s2);

            return b2.compareTo(b1);
          }
        });
    return s;
  }

  public boolean isPrime(String val) {
    BigInteger b = new BigInteger(val);
    return b.isProbablePrime(1 - 1 / 2);
  }
}
