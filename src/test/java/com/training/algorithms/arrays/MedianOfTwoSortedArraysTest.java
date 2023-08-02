package com.training.algorithms.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {

    MedianOfTwoSortedArrays subject;
    @BeforeEach
    void setUp() {
        subject = new MedianOfTwoSortedArrays();
    }

    @Test
    void medianOfTwoSortedArrays_Test1(){
        int[] arr1 = {1,3};
        int[] arr2 = {2};
        var result = subject.calculate(arr1,arr2);
        Assertions.assertEquals(2.0d,result);
    }

    @Test
    void medianOfTwoSortedArrays_Test2(){
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        var result = subject.calculate(arr1,arr2);
        Assertions.assertEquals(2.5d,result);
    }

    @Test
    void medianOfTwoSortedArrays_Test3(){
        int[] arr1 = {};
        int[] arr2 = {1};
        var result = subject.calculate(arr1,arr2);
        Assertions.assertEquals(1d,result);
    }

    @Test
    void medianOfTwoSortedArrays_Test4(){
        int[] arr1 = {2,2,4,4};
        int[] arr2 = {2,2,4,4};
        var result = subject.calculate(arr1,arr2);
        Assertions.assertEquals(3d,result);
    }
}