package Arrays.ThreeSum;

import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> help = new HashSet<>();
        if(nums.length == 0) return new ArrayList();
        Arrays.sort(nums);
        int res = 0;
        for(int i = 0 ; i<nums.length; i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                res =nums[i] + nums[j] + nums[k];
                if(res == 0) help.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                if(res< 0) j++;
                if(res> 0 ) k--;
            }
        }
        return new ArrayList<>(help);
    }
}