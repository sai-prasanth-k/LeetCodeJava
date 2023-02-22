package Palindrome;

class Solution {
    public boolean isPalindrome(int x) {
        if(x ==0) return true;
        if(x <0 || x %10 ==0) return false;

        int reversed_num = 0;

        while(x>reversed_num){
            int pop = x % 10 ;
            x /=10;

            reversed_num = (reversed_num * 10) + pop;
        }
        if(x == reversed_num || x == reversed_num /10 ) {
            return true;
        }else {
            return false;
        }

    }
}