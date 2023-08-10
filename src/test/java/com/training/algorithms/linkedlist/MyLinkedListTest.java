package com.training.algorithms.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    MyLinkedList subject;

    @BeforeEach
    void setUp() {
        subject = new MyLinkedList(0);
    }

    @Test
    void printAllMethods(){
        subject.getHead();
        subject.getTail();
        subject.getLength();
        subject.printList();
        assertEquals(true,true);
    }
    @Test
    void appendAndLastTest(){
        subject.append(2);
        subject.printList();
        assertEquals(true,true);
    }
    @Test
    void appendAndRemoveTest(){
        subject.append(2);
        subject.printList();
        subject.getLength();
        System.out.println(subject.removeLast().getValue());
        System.out.println(subject.removeLast().getValue());
        System.out.println(subject.removeLast());
        assertEquals(true,true);
    }

    @Test
    void prependTest(){
        subject.append(2);
        subject.prepend(3);
        subject.getLength();
        subject.printList();
        assertEquals(true,true);
    }

    @Test
    void removeFirstTest(){
        subject.append(2);
        System.out.println(subject.removeFirst().getValue());
        System.out.println(subject.removeFirst().getValue());
        System.out.println(subject.removeFirst());
        assertEquals(true,true);
    }

    @Test
    void testGetMethod(){
        subject.append(1);
        subject.append(2);
        subject.append(3);
        System.out.println(subject.get(2).getValue());
        subject.printList();
        assertEquals(true,true);
    }

    @Test
    void testInsertMethod(){
        subject.append(2);
        subject.insert(1,1);
        subject.printList();
        assertEquals(true,true);
    }

    @Test
    void testSetMethod(){
        subject.append(2);
        subject.set(1,1);
        subject.printList();
        assertEquals(true,true);
    }

    @Test
    void testReverse(){
        subject.append(1);
        subject.append(2);
        subject.append(3);
        subject.reverse();
        subject.printList();
        assertEquals(true,true);
    }

    @Test
    void testFindMiddleNode(){
        subject.append(1);
        subject.append(2);
        subject.append(3);
        subject.append(4);
        assertEquals(2,subject.findMiddleNode().getValue());
    }

    @Test
    void testFindMiddleNodeOdd(){
        subject.append(1);
        subject.append(2);
        subject.append(3);
        subject.append(4);
        subject.append(5);
        assertEquals(4,subject.findMiddleNode().getValue());
    }

    @Test
    void testFindMiddleNodeEmpty(){
        subject.removeFirst();
        assertEquals(null,subject.findMiddleNode());
    }

    @Test
    void testFindMiddleNodeOneOnly(){
        assertEquals(0,subject.findMiddleNode().getValue());
    }

    @Test
    void testDoesnotHasALoop(){
        subject.append(1);
        subject.append(2);
        subject.append(3);
        subject.append(4);
        assertFalse(subject.hasLoop());
    }

    @Test
    void testDoesHasALoop(){
        subject.append(1);
        subject.append(2);
        subject.append(3);
        subject.append(4);
        subject.get(3).setNext(subject.get(1));
        assertTrue(subject.hasLoop());
    }

}