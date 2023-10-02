package com.training.algorithms.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExamples {

  public boolean validateIPAddress(String test) {
    String pattern =
        "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    if (test.matches(pattern)) {
      return true;
    } else {
      return false;
    }
  }

  public String removeDuplicates(String sample) {
    String pattern = "\\b(\\w+)(\\s+\\1\\b)+";
    Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
    Matcher m = p.matcher(sample);
    while (m.find()) {
      // System.out.println("group:" + m.group() + "  group2:" + m.group(1));
      sample = sample.replaceAll(m.group(), m.group(1));
    }
    return sample;
  }

  public String validateUserNames(String test) {
    String pattern = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
    if (test.matches(pattern)) {
      return "Valid";
    } else {
      return "Invalid";
    }
  }

  public String contentExtractor(String test) {
    String pattern = "<(.+)>([^<]+)</\\1>";
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(test);
    StringBuilder result = new StringBuilder();
    int i = 0;
    while (m.find()) {
      if (i > 0) {
        result.append("\n");
      }
      result.append(m.group(2));
      i++;
    }
    if (!result.toString().isEmpty()) {
      return result.toString();
    }
    return "None";
  }
}
