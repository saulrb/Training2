package com.training.algorithms.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {

    RegularExpressionMatching subject;
    String s , p ;
    @BeforeEach
    void setUp() {
        subject = new RegularExpressionMatching();
    }

    @ParameterizedTest
    @CsvSource(value = {"aa:a:false","aa:aa:true","aaa:aa:false","aa:a*:true" ,"aa:.*:true","ab:.*:true","aab:c*a*b:true"}, delimiter = ':')
    void is_match_case1(String s, String p, String r){
        boolean result = Boolean.parseBoolean(r);
        Assertions.assertTrue(result == subject.isMatch(s,p));
    }


    @ParameterizedTest
    @CsvSource(value = {"aa:a:false","aa:aa:true","aaa:aa:false","aa:a*:true" ,"aa:.*:true","ab:.*:true","aab:c*a*b:true"}, delimiter = ':')
    void is_match_case2(String s, String p, String r){
        boolean result = Boolean.parseBoolean(r);
        Assertions.assertTrue( result == subject.isMatch2(s,p));
    }

}