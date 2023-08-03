package com.training.algorithms.strings;

public class WildcardMatching {
    public boolean isMatch(String s, String p) {
        if (null == s | null == p)
            return false;
        int i = 0, j = 0, startIndex = -1, iIndex = -1;
        while (i < s.length()) {
            if (j < p.length() && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
                ++i;
                ++j;
            } else if (j < p.length() && p.charAt(j) == '*') {
                startIndex = j;
                iIndex = i;
                j++;
            } else if (startIndex != -1) {
                j = startIndex + 1;
                i = iIndex + 1;
                iIndex++;
            } else {
                return false;
            }
        }
        while (j < p.length() && p.charAt(j) == '*') {
            ++j;
        }
        return j == p.length();
    }
}
