package com.training.algorithms.strings;

import java.util.HashMap;
import java.util.Map;

public class IsoMorphicStrings {
    Map<Character, Character> sToT = new HashMap<>();
    Map<Character, Character> tToS = new HashMap<>();
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null)
            return false;
        if (s.length() != t.length())
            return false;
        if( s.length() == 0 && t.length() == 0)
            return true;
        for(int i = 0; i < s.length() ; i++){
            if(!sToT.containsKey(s.charAt(i)))
                sToT.put(s.charAt(i),t.charAt(i));
            if(!tToS.containsKey(t.charAt(i)))
                tToS.put(t.charAt(i),s.charAt(i));
            if( !isSToTMapReplacingOk(sToT,s,t,i) || !isTToSMapReplacingOk(tToS,s,t,i) )
                return false;
        }

        return true;
    }

    private boolean isSToTMapReplacingOk( Map<Character, Character> sToT, String s,String t, int i){
        return sToT.get(s.charAt(i)) == t.charAt(i);
    }
    private boolean isTToSMapReplacingOk( Map<Character, Character> tToS, String s,String t, int i){
        return tToS.get(t.charAt(i)) == s.charAt(i);
    }

}
