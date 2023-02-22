package Strings.TruncateSentence;

import java.util.*;
class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < k;i++){
            res.append(words[i]).append(" ");
        }
        res.setLength(res.length() -1);
        return res.toString();
    }
}
