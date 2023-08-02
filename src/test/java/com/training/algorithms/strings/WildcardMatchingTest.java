package com.training.algorithms.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WildcardMatchingTest {

    WildcardMatching subject;

    @BeforeEach
    void setUp() {
        subject = new WildcardMatching();
    }

    @Test
    void test_positive_match(){
        String s = "aab";
        String p = "*ab";
        var result = subject.isMatch(s,p);
        Assertions.assertTrue(result);
    }
    @Test
    void test_positive_match2(){
        String s = "zab";
        String p = "z?b";
        var result = subject.isMatch(s,p);
        Assertions.assertTrue(result);
    }
    @Test
    void test_positive_match3(){
        String s = "aaazab";
        String p = "*z?b";
        var result = subject.isMatch(s,p);
        Assertions.assertTrue(result);
    }
    @Test
    void test_negative_match2(){
        String s = "zab";
        String p = "zxb";
        var result = subject.isMatch(s,p);
        Assertions.assertFalse(result);
    }
}