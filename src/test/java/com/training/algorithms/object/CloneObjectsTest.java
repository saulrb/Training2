package com.training.algorithms.object;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CloneObjectsTest {

  CloneObjects cloneObjects;
  @BeforeEach
  void setUp() {
    cloneObjects = new CloneObjects();
  }

  @Test
  void testClone() {
    CloneObjects cloneObjects2 = cloneObjects.clone();
    assertNotEquals(cloneObjects, cloneObjects2);
  }
}
