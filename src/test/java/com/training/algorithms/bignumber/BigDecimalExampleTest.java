package com.training.algorithms.bignumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BigDecimalExampleTest {

  String[] array = {"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};
  String[] expected = {"90", "56.6", "50", "02.34", "0.12", ".12", "0", "000.000", "-100"};
  BigDecimalExample bigDecimalExample;

  @BeforeEach
  void setUp() {
    bigDecimalExample = new BigDecimalExample();
  }

  @Test
  void testSorting() {
    String[] actual = bigDecimalExample.sort(array);
    assertArrayEquals(expected, actual);
  }

  @Test
  void testItisNotaPrime() {
    String val = "1";
    assertFalse(bigDecimalExample.isPrime(val));
  }

  @Test
  void testItisPrime() {
    String val = "13";
    assertTrue(bigDecimalExample.isPrime(val));
  }
}
