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

  @Test
  void RemoveLastItem() {
    subject.append(2);
    subject.append(3);
    subject.append(4);
    subject.printList();
    assertEquals(1, subject.getHead().value);
    assertEquals(4, subject.getTail().value);
    assertEquals(4, subject.getLength());
    subject.remove(4);
    subject.printList();
    assertEquals(1, subject.getHead().value);
    assertEquals(3, subject.getTail().value);
    assertEquals(3, subject.getLength());
  }

  @Test
  void swapFirstAndLast() {
    subject.append(2);
    subject.append(3);
    subject.append(4);
    subject.printList();
    assertEquals(1, subject.getHead().value);
    assertEquals(4, subject.getTail().value);
    assertEquals(4, subject.getLength());
    subject.swapFirstAndLast();
    subject.printList();
    assertEquals(4, subject.getHead().value);
    assertEquals(1, subject.getTail().value);
    assertEquals(4, subject.getLength());
  }

  @Test
  void reverseDoubleLinkedList() {
    subject.append(2);
    subject.append(3);
    subject.append(4);
    subject.printList();
    assertEquals(1, subject.getHead().value);
    assertEquals(4, subject.getTail().value);
    assertEquals(4, subject.getLength());
    subject.reverse();
    subject.printList();
    assertEquals(4, subject.getHead().value);
    assertEquals(1, subject.getTail().value);
    assertEquals(4, subject.getLength());
  }
}
