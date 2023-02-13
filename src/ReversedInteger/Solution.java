package ReversedInteger;

class Solution {
    public int reverse(int x) {
        long reversed = 0;

        while(x != 0){
            reversed = (reversed * 10) + (x % 10);
            x /= 10;

        }
        if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) return 0;
        if(x > 0) return (int)(-1*reversed);
        return (int)reversed;
    }
}