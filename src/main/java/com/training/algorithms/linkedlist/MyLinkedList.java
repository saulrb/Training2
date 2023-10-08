package com.training.algorithms.linkedlist;

public class MyLinkedList {
  private Node head;
  private Node tail;
  private int length;

  public MyLinkedList(int value) {
    Node newNode = new Node(value, null);
    head = newNode;
    tail = newNode;
    length = 1;
  }

  public void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.getValue());
      if (temp.getNext() != null) {
        System.out.print(" -> ");
      }
      temp = temp.getNext();
    }
    System.out.println();
  }

  public void append(int value) {
    var node = new Node(value, null);
    if (length == 0) {
      head = node;
      tail = node;
    } else {
      tail.setNext(node);
      tail = node;
    }
    length++;
  }

  public void prepend(int value) {
    Node newNode = new Node(value, null);
    if (length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.setNext(head);
      head = newNode;
    }
    length++;
  }

  public Node removeFirst() {
    Node temp = null;
    if (length == 0) {
      return temp;
    } else {
      temp = head;
      head = head.getNext();
    }
    length--;
    if (length == 0) {
      tail = null;
    }
    return temp;
  }

  public Node removeLast() {
    if (length == 0) return null;
    Node pre = head;
    Node temp = head;
    while (temp.getNext() != null) {
      pre = temp;
      temp = temp.getNext();
    }
    tail = pre;
    tail.setNext(null);
    length--;
    if (length == 0) {
      tail = null;
      head = null;
    }
    return temp;
  }

  public boolean set(int index, int value) {
    Node temp = get(index);
    if (temp != null) {
      temp.setValue(value);
      return true;
    }
    return false;
  }

  public boolean insert(int index, int value) {
    if (index < 0 || index > length) {
      return false;
    }
    if (index == 0) {
      prepend(value);
      return true;
    }
    if (index == length) {
      append(value);
      return true;
    }
    Node newNode = new Node(value, null);
    Node temp = get(index - 1);
    newNode.setNext(temp.getNext());
    temp.setNext(newNode);
    length++;
    return true;
  }

  public Node get(int index) {
    if (index < 0 || index >= length) {
      return null;
    }
    Node temp = head;
    for (int i = 0; i < index; i++) {
      temp = temp.getNext();
    }
    return temp;
  }

  public void getHead() {
    System.out.println("Head:" + head.getValue());
  }

  public void getTail() {
    System.out.println("Tail:" + tail.getValue());
  }

  public int getLength() {
    System.out.println("Length:" + length);
    return length;
  }

  public Node remove(int index) {
    if (index < 0 || index >= length) return null;
    if (index == 0) return removeFirst();
    if (index == length - 1) return removeLast();
    Node prev = get(index - 1);
    Node temp = prev.getNext();
    prev.setNext(temp.getNext());
    temp.setNext(null);
    length--;
    return temp;
  }

  public void reverse() {
    Node temp = head;
    head = tail;
    tail = temp;
    Node after = null;
    Node before = null;
    for (int i = 0; i < length; i++) {
      after = temp.getNext();
      temp.setNext(before);
      before = temp;
      temp = after;
    }
  }

  public Node findMiddleNode() {
    if (length == 0) return null;
    if (length == 1) return head;
    if (length % 2 == 0) {
      return get((length / 2) + 1);
    }
    var middleIndex = (int) Math.floor(length / 2);
    return get(middleIndex);
  }

  public boolean hasLoop() {
    if (length == 0) return false;
    if (length == 1) return false;
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.getNext() != null) {
      slow = slow.getNext();
      fast = fast.getNext().getNext();
      if (slow == fast) return true;
    }
    return false;
  }

  public Node findKthFromEnd(int i) {
    if (length == 0) return null;
    if (i > length || ((length - i) + 1) < 0) {
      return null;
    }
    return get((length - i) + 1);
  }

  public void reverseBetween(int m, int n) {
    if (m == n) return;
    Node prev = null;
    Node curr = head;
    while (m > 1) {
      prev = curr;
      curr = curr.getNext();
      m--;
      n--;
    }
    Node con = prev;
    Node tail = curr;
    Node third;
    while (n > 0) {
      third = curr.getNext();
      curr.setNext(prev);
      prev = curr;
      curr = third;
      n--;
    }
    if (con != null) {
      con.setNext(prev);
    } else {
      head = prev;
    }
    tail.setNext(curr);
  }

  public void partitionList(int i) {
    Node beforeStart = null;
    Node beforeEnd = null;
    Node afterStart = null;
    Node afterEnd = null;
    Node curr = head;
    while (curr != null) {
      Node next = curr.getNext();
      curr.setNext(null);
      if (curr.getValue() < i) {
        if (beforeStart == null) {
          beforeStart = curr;
          beforeEnd = beforeStart;
        } else {
          beforeEnd.setNext(curr);
          beforeEnd = curr;
        }
      } else {
        if (afterStart == null) {
          afterStart = curr;
          afterEnd = afterStart;
        } else {
          afterEnd.setNext(curr);
          afterEnd = curr;
        }
      }
      curr = next;
    }
    if (beforeStart == null) {
      head = afterStart;
    } else {
      beforeEnd.setNext(afterStart);
      head = beforeStart;
    }
  }

  public void removeDuplicates() {
    Node curr = head;
    while (curr != null) {
      Node runner = curr;
      while (runner.getNext() != null) {
        if (runner.getNext().getValue() == curr.getValue()) {
          runner.setNext(runner.getNext().getNext());
          length--;
        } else {
          runner = runner.getNext();
        }
      }
      curr = curr.getNext();
    }
  }

  public int convertFromBinaryToDecimal() {
    int result = 0;
    Node curr = head;
    int pow = this.getLength() - 1;
    while (curr != null) {
      result += curr.getValue() * (int) (Math.pow(2, pow));
      pow--;
      curr = curr.getNext();
    }
    return result;
  }
}
