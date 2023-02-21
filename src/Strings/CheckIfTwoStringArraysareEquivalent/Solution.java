package Strings.CheckIfTwoStringArraysareEquivalent;

import java.util.*;
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder res1 = new StringBuilder();
        StringBuilder res2 = new StringBuilder();
        for(String s : word1) res1.append(s);
        for(String s:word2) res2.append(s);
        return res1.compareTo(res2) == 0;
    }
}