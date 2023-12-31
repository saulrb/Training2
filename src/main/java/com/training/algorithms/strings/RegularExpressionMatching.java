package com.training.algorithms.strings;

public class RegularExpressionMatching {
  public boolean isMatch(String s, String p) {
    if (p.isEmpty()) return s.isEmpty();
    if (p.length() == 1 || p.charAt(1) != '*') {
      if (s.isEmpty() || (p.charAt(0) != '.' && s.charAt(0) != p.charAt(0))) return false;
      return isMatch(s.substring(1), p.substring(1));
    }
    int len = s.length();

    int i = -1;
    while (i < len && (i < 0 || p.charAt(0) == '.' || p.charAt(0) == s.charAt(i))) {
      if (isMatch(s.substring(i + 1), p.substring(2))) return true;
      i++;
    }
    return false;
  }

  public boolean isMatch2(String s, String p) {
    // base case
    if (p.isEmpty()) {
      return s.isEmpty();
    }
    // special case
    if (p.length() == 1) {
      // if the length of s is 0, return false
      if (s.isEmpty()) {
        return false;
      }
      // if the first does not match, return false
      else if ((p.charAt(0) != s.charAt(0)) && (p.charAt(0) != ',')) {
        return false;
      } // otherwise, compare the rest of the string of s and p.
      else {
        return isMatch2(s.substring(1), p.substring(1));
      }
    }
    // case 1: when the second char of p is not '*'
    if (p.charAt(1) != '*') {
      if (s.isEmpty()) {
        return false;
      } else {
        return isMatch2(s.substring(1), p.substring(1));
      }
      // case 2: when the second char of p is '*', complex case.
    } else {
      // case 2.1: a char & '*' can stand for 0 element
      if (isMatch2(s, p.substring(2))) {
        return true;
      }
      // case 2.2: a char & '*' can stand for 1 or more preceding element,
      // so try every sub string
      int i = 0;
      while (i < s.length() && (s.charAt(i) == p.charAt(0) || p.charAt(0) == '.')) {
        if (isMatch2(s.substring(i + 1), p.substring(2))) {
          return true;
        }
        i++;
      }
      return false;
    }
  }
}
