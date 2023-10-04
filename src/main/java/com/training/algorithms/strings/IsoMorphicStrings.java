package com.training.algorithms.strings;

import java.util.HashMap;
import java.util.Map;

public class IsoMorphicStrings {
  Map<Character, Character> sToT = new HashMap<>();
  Map<Character, Character> tToS = new HashMap<>();

  public boolean isIsomorphic(String s, String t) {
    if (s == null || t == null) return false;
    if (s.length() != t.length()) return false;
    if (s.isEmpty()) return true;
    for (int i = 0; i < s.length(); i++) {
      if (!sToT.containsKey(s.charAt(i))) sToT.put(s.charAt(i), t.charAt(i));
      if (!tToS.containsKey(t.charAt(i))) tToS.put(t.charAt(i), s.charAt(i));
      if (veryfyReplacing(sToT, s, t, i) || veryfyReplacing(tToS, t, s, i)) return false;
    }

    return true;
  }

  private boolean veryfyReplacing(Map<Character, Character> refMap, String a, String b, int i) {
    return refMap.get(a.charAt(i)) != b.charAt(i);
  }
}
