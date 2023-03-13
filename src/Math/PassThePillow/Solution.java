package Math.PassThePillow;

class Solution {
    public int passThePillow(int n, int time) {
        int pass = time/(n-1);
        int k = time %(n-1);
        if(pass %2 == 0){
            return k+1;
        }else {
            return n-k;
        }
    }
}
