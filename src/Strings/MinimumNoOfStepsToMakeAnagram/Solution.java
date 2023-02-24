package Strings.MinimumNoOfStepsToMakeAnagram;

class Solution {
    public int minSteps(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        int res = 0;
        int[] counts = new int[26];

        for(int i =0; i< sLen; i++){
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for(int count : counts){
            if(count > 0 ) res+=count;
        }
        return res;
    }
}
