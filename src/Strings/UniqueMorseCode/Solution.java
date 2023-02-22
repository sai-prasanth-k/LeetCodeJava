package Strings.UniqueMorseCode;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        final String[] morse = {".-",   "-...", "-.-.", "-..",  ".",   "..-.", "--.",  "....", "..",
                ".---", "-.-",  ".-..", "--",   "-.",  "---",  ".--.", "--.-", ".-.",
                "...",  "-",    "..-",  "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> ans = new HashSet<>();

        for (final String word : words) {
            StringBuilder res = new StringBuilder();
            for (final char c : word.toCharArray())
                res.append(morse[c - 'a']);
            ans.add(res.toString());
        }

        return ans.size();
    }
}
