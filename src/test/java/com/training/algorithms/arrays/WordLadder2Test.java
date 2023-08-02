package com.training.algorithms.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class WordLadder2Test {


    WordLadder2 subject;
    static Set<String> dictionary = new HashSet<>() {{
        add("hot");
        add("dot");
        add("dog");
        add("lot");
        add("log");
    }};

    @BeforeEach
    void setUp() {
        subject = new WordLadder2();
    }

    @Test
    void TestWordladder() {
        var start = "hit";
        var end = "cog";
        var value = subject.calculate(dictionary, start, end);
        Assertions.assertArrayEquals(value.get(1).toArray(),  new String[] {"hit","hot","dot","dog","cog"});
        Assertions.assertArrayEquals(value.get(0).toArray(),  new String[] {"hit","hot","lot","log","cog"});
    }
}