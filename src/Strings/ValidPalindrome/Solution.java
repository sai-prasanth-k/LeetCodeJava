package Strings.ValidPalindrome;

class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(char c: s.toCharArray()){
            if(Character.isLetter(c) || Character.isDigit(c)){
                str+=c;
            }
        }
        str = str.toLowerCase();

        int start =0;
        int end = str.length() -1;
        while(start<end){
            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
