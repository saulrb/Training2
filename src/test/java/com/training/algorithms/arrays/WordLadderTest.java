package com.training.algorithms.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class WordLadderTest {

    WordLadder subject;
    static Set<String> dictionary = new HashSet<>(){{add("hot");add("dot");add("dog");add("lot");add("log");}};

    @BeforeEach
    void setUp() {
        subject = new WordLadder();
    }

    @Test
    void TestWordladder() {
        var start = "hit";
        var end = "cog";
        int value = subject.calculate(dictionary,start,end);
        Assertions.assertEquals(5,value);
    }
}