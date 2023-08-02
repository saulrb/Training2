package com.training.algorithms.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementTest {

    KthLargestElement subject;

    @BeforeEach
    void setUp() {
        subject = new KthLargestElement();
    }

    @Test
    void find_kth_largestElement(){
        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        int value = subject.findKthLargest(arr,k);
        Arrays.stream(arr).forEach(System.out::print);
        Assertions.assertEquals(5,value);
    }

    @Test
    void find_kth_largestElement_QuickSort(){
        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        int value = subject.findKthLargestQS(arr,k);
        Arrays.stream(arr).forEach(System.out::print);
        Assertions.assertEquals(5,value);
    }

    @Test
    void find_kth_largestElement_HeapSort(){
        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        int value = subject.findKthLargestH(arr,k);
        Assertions.assertEquals(5,value);
    }
}