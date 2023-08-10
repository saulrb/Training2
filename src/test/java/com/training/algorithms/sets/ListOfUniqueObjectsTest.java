package com.training.algorithms.sets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListOfUniqueObjectsTest {

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
  ListOfUniqueObjects listOfUniqueObjects;
  @BeforeEach
  void setUp() {
    listOfUniqueObjects = new ListOfUniqueObjects();
  }

  @Test
  void getUniqueObjects() {
    var uniqueObjects = listOfUniqueObjects.getUniqueObjects(items);
    uniqueObjects.forEach(System.out::println);
    assertEquals(7, uniqueObjects.size());
  }
}
