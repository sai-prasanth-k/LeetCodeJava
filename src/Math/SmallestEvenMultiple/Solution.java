package Math.SmallestEvenMultiple;

class Solution {

    //if the number is even then directly return the number. As the number itself is the smallest
    //If the number is odd then multiply it with 2 then return the multiplied no
    public int smallestEvenMultiple(int n) {
        if(n % 2 ==0){
            return n;
        }else {
            return n*2;
        }

    }
}
