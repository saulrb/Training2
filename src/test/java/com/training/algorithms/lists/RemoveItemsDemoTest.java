package com.training.algorithms.lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveItemsDemoTest {

  RemoveItemsDemo removeItemsDemo;
  List list = null;

  @BeforeEach
  void setUp() {
    list = new ArrayList();
    list.addAll(Arrays.asList(1, 2, 3, 4, 5, 3, 10, 3, 11, 12, 15, 3));
    removeItemsDemo = new RemoveItemsDemo();
  }

  @Test
  void removeItems() throws Exception {
    var total = list.size();
    removeItemsDemo.removeItems(list, 3);
    assertEquals(total - 4, list.size());
  }
}
