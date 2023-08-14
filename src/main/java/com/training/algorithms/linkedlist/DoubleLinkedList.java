package com.training.algorithms.linkedlist;

public class DoubleLinkedList {

  private MyNode head;
  private MyNode tail;
  private int length;

  public DoubleLinkedList(int value) {
    MyNode node = new MyNode(value);
    this.head = node;
    this.tail = node;
    this.length = 1;
  }

  public void printList() {
    if (this.head == null) {
      System.out.println("[]");
      return;
    }
    MyNode current = this.head;
    System.out.print("[");
    while (current != null) {
      System.out.print(current.value);
      current = current.next;
      if (current != null) {
        System.out.print(" <--> ");
      }
    }
    System.out.println("]");
  }

  public void append(int value) {
    MyNode node = new MyNode(value);
    if (length == 0) {
      head = node;
      tail = node;
    } else {
      node.prev = this.tail;
      this.tail.next = node;
      this.tail = node;
    }
    this.length++;
  }

  public MyNode getHead() {
    return this.head;
  }

  public MyNode getTail() {
    return this.tail;
  }

  public int getLength() {
    return this.length;
  }

  public void remove(int i) {
    if( this.head != null) {
      MyNode current = this.head;
      while (current != null) {
        if (current.value == i) {
          if (current == this.head) {
            this.head = current.next;
            this.head.prev = null;
          } else if (current == this.tail) {
            this.tail = current.prev;
            this.tail.next = null;
          } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
          }
          this.length--;
          return;
        }
        current = current.next;
      }
    }
  }
}
