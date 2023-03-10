package Arrays.KidsWithGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();

        int max=Integer.MIN_VALUE;

        for(int i=0;i<candies.length;i++)
            if(candies[i]>max)
                max=candies[i];
        for(int i:candies){
            if(extraCandies+i >=max)
                res.add(true);
            else
                res.add(false);

        }

        return res;
    }
}
