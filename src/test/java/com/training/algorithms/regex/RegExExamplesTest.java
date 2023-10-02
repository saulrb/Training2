package com.training.algorithms.regex;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RegExExamplesTest {

  RegExExamples regExExamples;

  private static Stream<Arguments> provideTestValidateIPAddress() {
    return Stream.of(
        Arguments.of("12.12.12.12", true),
        Arguments.of("13.13.13.112", true),
        Arguments.of("VUUT.12.12", false),
        Arguments.of("111.111.11.111", true),
        Arguments.of("1.1.1.1.1.1.1", false),
        Arguments.of("....", false),
        Arguments.of("1...1..1..1", false),
        Arguments.of("0.0.0.0", true),
        Arguments.of("255.0.255.0", true),
        Arguments.of("266.266.266.266", false),
        Arguments.of("00000.000000.0000000.00001", false),
        Arguments.of("0023.0012.0012.0034", false));
  }

  private static Stream<Arguments> provideTestRemoveDuplicates() {
    return Stream.of(
        Arguments.of("I love Love to To tO code", "I love to code"),
        Arguments.of("Goodbye bye bye world world world", "Goodbye bye world"),
        Arguments.of("Sam went went to to to his business", "Sam went to his business"),
        Arguments.of(
            "Reya is is the the best player in eye eye game",
            "Reya is the best player in eye game"),
        Arguments.of("in inthe", "in inthe"),
        Arguments.of("Hello hello Ab aB", "Hello Ab"));
  }

  private static Stream<Arguments> provideTestValidateUserNames() {
    return Stream.of(
        Arguments.of("Julia", "Invalid"),
        Arguments.of("Samantha", "Valid"),
        Arguments.of("Samantha_21", "Valid"),
        Arguments.of("1Samantha", "Invalid"),
        Arguments.of("Samantha?10_2A", "Invalid"),
        Arguments.of("JuliaZ007", "Valid"),
        Arguments.of("Julia@007", "Invalid"),
        Arguments.of("_Julia007", "Invalid"));
  }

  private static Stream<Arguments> provideTestContentExtractor() {
    return Stream.of(
        Arguments.of("<h1>Nayeem loves counseling</h1>", "Nayeem loves counseling"),
        Arguments.of(
            "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>",
            "Sanjay has no watch\nSo wait for a while"),
        Arguments.of("<Amee>safat codes like a ninja</amee>", "None"),
        Arguments.of(
            "<SA premium>Imtiaz has a secret crush</SA premium>", "Imtiaz has a secret crush"));
  }

  @BeforeEach
  void setUp() throws Exception {
    regExExamples = new RegExExamples();
  }

  @ParameterizedTest
  @MethodSource("provideTestValidateIPAddress")
  void testValidateIPAddress(String test, boolean expected) {
    assertEquals(expected, regExExamples.validateIPAddress(test));
  }

  @ParameterizedTest
  @MethodSource("provideTestRemoveDuplicates")
  void testRemoveDuplicates(String sample, String expected) {
    assertEquals(expected, regExExamples.removeDuplicates(sample));
  }

  @ParameterizedTest
  @MethodSource("provideTestValidateUserNames")
  void testValidateUserNames(String test, String expected) {
    assertEquals(expected, regExExamples.validateUserNames(test));
  }

  @ParameterizedTest
  @MethodSource("provideTestContentExtractor")
  void testContentExtractor(String test, String expected) {
    assertEquals(expected, regExExamples.contentExtractor(test));
  }
}
