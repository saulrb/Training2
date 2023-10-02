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

  public MyNode remove(int i) {
    if (this.head != null) {
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
          return current;
        }
        current = current.next;
      }
    }
    return null;
  }

  public MyNode removeIndex(int index) {
    if (index < 0 || index >= length) return null;
    MyNode current = this.get(index);
    if (index == 0) return this.removeFirst();
    if (index == length - 1) return this.removeLast();
    current.prev.next = current.next;
    current.next.prev = current.prev;
    current.next = null;
    current.prev = null;
    this.length--;
    return current;
  }

  public MyNode removeLast() {
    if (length == 0) return null;
    MyNode temp = tail;
    if (length == 1) {
      this.head = null;
      this.tail = null;
    } else {
      this.tail = this.tail.prev;
      this.tail.next = null;
      temp.prev = null;
    }
    this.length--;
    return temp;
  }

  public void prepend(int value) {
    MyNode newNode = new MyNode(value);
    if (length == 0) {
      this.head = newNode;
      this.tail = newNode;
    } else {
      newNode.next = this.head;
      this.head.prev = newNode;
      this.head = newNode;
    }
    length++;
  }

  public MyNode removeFirst() {
    if (length == 0) return null;
    MyNode temp = head;
    if (length == 1) {
      this.head = null;
      this.tail = null;
    } else {
      this.head = this.head.next;
      this.head.prev = null;
      temp.next = null;
    }
    this.length--;
    return temp;
  }

  public MyNode get(int index) {
    if (index < 0 || index >= length) {
      return null;
    }
    MyNode current = this.head;
    if (index < length / 2) {
      int i = 0;
      while (i != index) {
        current = current.next;
        i++;
      }
    } else {
      int i = length - 1;
      current = this.tail;
      while (i != index) {
        current = current.prev;
        i--;
      }
    }
    return current;
  }

  public boolean set(int index, int value) {
    MyNode node = this.get(index);
    if (node != null) {
      node.value = value;
      return true;
    }
    return false;
  }

  public boolean insert(int index, int value) {
    if (index < 0 || index > length) return false;
    if (index == 0) {
      this.prepend(value);
      return true;
    }
    if (index == length) {
      this.append(value);
      return true;
    }
    MyNode newNode = new MyNode(value);
    ;
    MyNode before = this.get(index - 1);
    MyNode after = before.next;
    before.next = newNode;
    newNode.prev = before;
    newNode.next = after;
    after.prev = newNode;
    this.length++;
    return true;
  }

  public void swapFirstLast() {
    if (length < 2) return;
    MyNode first = this.head;
    MyNode last = this.tail;
    first.prev = last.prev;
    last.prev.next = first;
    last.next = first.next;
    first.next.prev = last;
    first.next = null;
    last.prev = null;
    this.head = last;
    this.tail = first;
  }

  public void printCharacter(String value ) {
    System.out.println(System.getProperty("file.encoding"));
    System.out.print("[");
    System.out.print(value);
    System.out.println("]");
  }
}
