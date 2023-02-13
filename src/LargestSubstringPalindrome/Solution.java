package LargestSubstringPalindrome;

class Solution {
    int resultStart, resultEnd;
    public String longestPalindrome(String s) {

        int strLength = s.length();

        if(strLength <2){
            return s;
        }
        for(int i =0; i< strLength-1;i++){
            expand(s, i,i);
            expand(s, i, i+1);
        }
        return s.substring(resultStart, resultStart + resultEnd);
    }

    private void expand(String str, int begin, int end){
        while(begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)){
            begin--;
            end++;
        }
        if(resultEnd < end- begin - 1){
            resultStart = begin +1;
            resultEnd = end- begin- 1;
        }
    }
}