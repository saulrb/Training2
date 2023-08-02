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
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
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

    public void getLength() {
        System.out.println("Length:" + length);
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

}
