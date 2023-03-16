package Math.HappyNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n){
        Set<Integer> seen = new HashSet<>();
        while (n!= 1 && !seen.contains(n)){
            seen.add(n);
            n = getNext(n);
        }
        return n ==1;
    }

    private int getNext(int n) {
        int res = 0;
        while (n>0){
            int pop = n % 10;
            n/=10;
            res +=pop * pop;
        }
        return res;
    }
}
