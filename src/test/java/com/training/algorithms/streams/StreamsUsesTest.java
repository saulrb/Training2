package com.training.algorithms.streams;

import static java.lang.Character.isDigit;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StreamsUsesTest {

  private String[] items = {
    "sugar|10|1.5|Azucar",
    "bread|2|4| bread ",
    "meat|1|10| beaf slides ",
    "sugar|10|1.5|Azucar",
    "bread|2|4| bread ",
    "fish|1|6| Salmon fish ",
    "sugar|10|1.5|Azucar",
    "beans|1000|6| beans seeds ",
    "tortilla|2|4| package with 25 slides",
    "bread|2|4| bread ",
    "sugar|10|1.5|Azucar",
    "margarine|1|2| it's butter",
    "tortilla|2|4| package with 25 slides",
    "bread|2|4| bread "
  };

  StreamsUses subject;

  @BeforeEach
  void setUp() {
    subject = new StreamsUses(items);
  }

  @Test
  void testGetLengths() {
    assertEquals(List.of(2, 5, 3, 7), subject.getLengths());
  }

  @Test
  void returnUniqueLetters() {
    assertEquals(List.of("h", "i", "e", "l", "o", "b", "y", "g", "d"), subject.getUniqueLetters());
  }

  @Test
  void returnUniqueLetters2() {
    assertEquals(List.of("h", "i", "e", "l", "o", "b", "y", "g", "d"), subject.getUniqueLetters2());
  }

  @Test
  void returnUniqueItems() {
    assertEquals(7, subject.getUniqueItems().size());
  }

  @Test
  void returnCountItems() {
    assertEquals(4, subject.countItems("sugar"));
  }

  @Test
  void returnUpperCase() {
    assertEquals(
        List.of(
            "SUGAR",
            "BREAD",
            "MEAT",
            "SUGAR",
            "BREAD",
            "FISH",
            "SUGAR",
            "BEANS",
            "TORTILLA",
            "BREAD",
            "SUGAR",
            "MARGARINE",
            "TORTILLA",
            "BREAD"),
        subject.getUpperCase());
  }

  @Test
  void listBeginsWithNumbers() {
    List<String> beginingWithNumbers =
        Stream.of("a", "1abc", "abc1").filter(value -> isDigit(value.charAt(0))).toList();
    assertEquals(List.of("1abc"), beginingWithNumbers);
  }

  @Test
  void mergeTwoListsofNumbers() {
    List<Integer> togetherNumbers =
        Stream.of(asList(1, 2, 3), asList(4, 5))
            .flatMap(Collection::stream) // Equivalent .flatMap(numbers -> numbers.stream())
            .toList();
    assertEquals(asList(1, 2, 3, 4, 5), togetherNumbers);
  }

  @Test void getMinPriceItem() {
    assertEquals(1.5, subject.getMinPriceItem());
  }
}
