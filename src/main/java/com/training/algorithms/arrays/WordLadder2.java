package com.training.algorithms.arrays;

import java.util.*;

public class WordLadder2 {
  public List<List<String>> calculate(Set<String> dictionary, String start, String end) {
    List<List<String>> result = new ArrayList<>();
    LinkedList<WordNode2> queue = new LinkedList<>();
    HashSet<String> visited = new HashSet<>();
    HashSet<String> unvisited = new HashSet<>(dictionary);

    queue.add(new WordNode2(start, 1, null));
    dictionary.add(end);
    int minStep = 0;
    int preNumSteps = 0;
    while (!queue.isEmpty()) {
      WordNode2 top = queue.remove();
      String word = top.word;
      int currNumSteps = top.numSteps;
      if (word.equals(end)) {
        if (minStep == 0) {
          minStep = top.numSteps;
        }
        if (top.numSteps == minStep && minStep != 0) {
          ArrayList<String> t = new ArrayList<>();
          t.add(top.word);
          while (top.pre != null) {
            t.add(0, top.pre.word);
            top = top.pre;
          }
          result.add(t);
          continue;
        }
      }
      if (preNumSteps < currNumSteps) {
        unvisited.removeAll(visited);
      }
      preNumSteps = currNumSteps;
      for (String w : dictionary) {
        if (wordsDelta(w, word) == 1 && unvisited.contains(w)) {
          queue.add(new WordNode2(w, top.numSteps + 1, top));
          visited.add(w);
        }
      }
    }
    return result;
  }

  private int wordsDelta(String a, String b) {
    int delta = 0;
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) != b.charAt(i)) {
        delta++;
      }
    }
    return delta;
  }
}

class WordNode2 {
  String word;
  int numSteps;
  WordNode2 pre;

  public WordNode2(String word, int numSteps, WordNode2 pre) {
    this.word = word;
    this.numSteps = numSteps;
    this.pre = pre;
  }
}
