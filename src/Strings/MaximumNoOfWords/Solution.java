package Strings.MaximumNoOfWords;

import java.util.*;
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for(String str : sentences){
            maxCount = Math.max(maxCount,new StringTokenizer(str).countTokens());
        }
        return maxCount;
    }
}
