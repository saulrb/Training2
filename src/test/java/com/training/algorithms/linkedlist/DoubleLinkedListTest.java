package com.training.algorithms.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DoubleLinkedListTest {

  DoubleLinkedList subject;

  @BeforeEach
  void setUp() {
    subject = new DoubleLinkedList(1);
  }

  @Test
  void createSingleItemList() {
    subject.printList();
    assertEquals(1, subject.getHead().value);
    assertEquals(1, subject.getTail().value);
    assertEquals(1, subject.getLength());
  }

  @Test
  void appendAnItem() {
    subject.append(2);
    subject.printList();
    assertEquals(1, subject.getHead().value);
    assertEquals(2, subject.getTail().value);
    assertEquals(2, subject.getLength());
  }
}
