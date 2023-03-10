package Arrays.Closest3Sum;

import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closestRes = Integer.MAX_VALUE;
        int res = 0 ;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                res = nums[i] + nums[j] + nums[k];
                if(res == target){
                    return res;
                }else if(Math.abs(target-res)<Math.abs(target - closestRes)){
                    closestRes = res;
                }
                if (res <= target) {
                    j += 1;
                    while (nums[j] == nums[j - 1] && j < k) {
                        j += 1;
                    }
                } else {
                    k-=1;
                }
            }

        }
        return closestRes;
    }
}
