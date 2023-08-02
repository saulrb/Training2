package com.training.algorithms.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsoMorphicStringsTest {

    IsoMorphicStrings subject;

    @BeforeEach
    void setUp() {
        subject = new IsoMorphicStrings();
    }

    @Test
    void isomorphic_test1(){
        String s = "egg";
        String t = "add";
        var isIsoMorphic = subject.isIsomorphic(s,t);
        Assertions.assertTrue(isIsoMorphic);
    }

    @Test
    void isomorphic_test2(){
        String s = "foo";
        String t = "bar";
        var isIsoMorphic = subject.isIsomorphic(s,t);
        Assertions.assertFalse(isIsoMorphic);
    }

    @Test
    void isomorphic_test3(){
        String s = "bbbaaaba";
        String t = "aaabbbba";
        var isIsoMorphic = subject.isIsomorphic(s,t);
        Assertions.assertFalse(isIsoMorphic);
    }


}