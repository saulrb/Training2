package com.training.algorithms.arrays;

import java.util.LinkedList;
import java.util.Set;

public class WordLadder {

    LinkedList<WordNode> listOfConversions = new LinkedList<>();

    public int calculate(Set<String> dictionary, String start, String end) {
        listOfConversions.add(new WordNode(start, 1));
        dictionary.add(end);
        while (!listOfConversions.isEmpty()) {
            WordNode top = listOfConversions.remove();
            String word = top.word;
            if (word.equals(end)) {
                return top.numSteps;
            }
            String tmp ="";
            for (String w : dictionary) {
                if (wordsDelta(w, word) == 1) {
                    listOfConversions.add(new WordNode(w, top.numSteps + 1));
                    tmp = w;
                }
            }
            dictionary.remove(tmp);

        }
        return 0;
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

class WordNode {
    String word;
    int numSteps;

    public WordNode(String word, int numSteps) {
        this.word = word;
        this.numSteps = numSteps;
    }
}