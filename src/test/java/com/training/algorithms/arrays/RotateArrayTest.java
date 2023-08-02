package com.training.algorithms.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    RotateArray subject;
    int[] array ;

    @BeforeEach
    void setUp() {
        subject = new RotateArray();
    }

    @Test
    void rotate_Array(){
        array = new int[] { 1,2,3,4,5,6,7};
        subject.rotate(array,3);
        Assertions.assertArrayEquals(array, new int[] {5,6,7,1,2,3,4});
    }
}