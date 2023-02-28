package Strings.LongestSubstring;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> map = new HashSet<>();
        int left = 0 ;
         int max = 0;

         for(int right = 0 ; right < s.length(); right++){
             if(map.contains(s.charAt(right))){
                 map.add(s.charAt(right));
                 max = Math.max(max,right-left+1);
             }else {
                        while (s.charAt(left) != s.charAt(right)){
                            map.remove(s.charAt(left));
                            left++;
                        }
                        left++;
             }
         }
         return max;
    }
}
