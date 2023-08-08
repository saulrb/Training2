package com.training.algorithms.lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMissingNumberInListTest {

  FindMissingNumberInList findMissingNumberInList;
  @BeforeEach
  void setUp() {
    findMissingNumberInList = new FindMissingNumberInList();
  }

  @Test
  void findMissingNumberInList() {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 9, 10};
    int missingNumber = findMissingNumberInList.findMissingNumberInList(numbers);
    assertEquals(8, missingNumber);
  }
  @Test
  void findMissingNumberInList2() {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,12,13};
    int missingNumber = findMissingNumberInList.findMissingNumberInList(numbers);
    assertEquals(11, missingNumber);
  }
}
