package Strings.Anagram;

class Solution {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if(sLen != tLen) return false;
        int[] char_count = new int[26];
        for(int i =0; i<sLen;i++){
            char_count[s.charAt(i)-'a']++;
            char_count[t.charAt(i)-'a']--;
        }
        for(int count : char_count){
            if(count !=0) return false;
        }
        return true;
    }
}