package com.training.algorithms.streams;

import com.training.algorithms.sets.Items;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsUses {
  private List<String> words = Arrays.asList("hi", "hello", "bye", "goodbye");

  private List<Items> itemsList = new ArrayList<>();

  public StreamsUses(String[] items) {
    for (String item : items) {
      String[] itemParts = item.split("\\|");
      itemsList.add(
          new Items(
              itemParts[0].trim(),
              Integer.parseInt(itemParts[1].trim()),
              Double.parseDouble(itemParts[2].trim()),
              itemParts[3].trim()));
    }
  }

  public List<Integer> getLengths() {
    return words.stream().map(String::length).collect(Collectors.toList());
  }

  public List<String> getUniqueLetters() {
    return words.stream()
        .flatMap(word -> Arrays.stream(word.split("")))
        .distinct()
        .collect(Collectors.toList());
  }

  public List<String> getUniqueLetters2() {
    return words.stream()
        .map(word -> word.split(""))
        .flatMap(Arrays::stream)
        .distinct()
        .collect(Collectors.toList());
  }

  public HashSet<Items> getUniqueItems() {
    return itemsList.parallelStream().collect(Collectors.toCollection(HashSet::new));
  }

  public int countItems(String itemTypeName) {
    return (int)
        itemsList.parallelStream().filter(item -> item.getName().equals(itemTypeName)).count();
  }

  public List<String> getUpperCase() {
    return itemsList.parallelStream()
        .map(item -> item.getName().toUpperCase())
        .collect(Collectors.toList());
  }

  public double getMinPriceItem() {
    return itemsList.parallelStream().mapToDouble(Items::getPrice).reduce(Double::min).orElse(0);
  }
}
