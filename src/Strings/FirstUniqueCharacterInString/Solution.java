package Strings.FirstUniqueCharacterInString;

class Solution {
    public int firstUniqChar(String s) {
        int res = Integer.MAX_VALUE;
        for(char c = 'a'; c<='z';c++){
            int initial = s.indexOf(c);
            if(initial != -1 && initial == s.lastIndexOf(c)) res = Math.min(res,initial);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}