package Strings.SplitAStringIntoBalancedString;

class Solution {
    public int balancedStringSplit(String s) {
        if(s.length() == 0) return 0;
        int len = s.length();
        int result = 0;
        int count = 0;
        for(int i =0 ; i<len;i++){
            if(s.charAt(i) == 'R') result++;
            if(s.charAt(i) == 'L') result--;
            if(result == 0) count++;
        }

        return count;
    }
}


