package Arrays.FourSum;

import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> help = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0) return new ArrayList<>();

        for(int i = 0 ; i< nums.length;i++){
            for(int j = i+1 ; j < nums.length ; j++){
                int start = j+1;
                int end = nums.length-1;

                while(start<end){
                    long ans = nums[i];
                    ans+=nums[j];
                    ans+=nums[start];
                    ans+=nums[end];
                    if(ans == target) {
                        help.add(Arrays.asList(nums[i],nums[j],nums[start],nums[end]));
                        start++;
                        end--;

                    }else if(ans < target){
                        start++;
                    }else {
                        end--;
                    }
                }
            }
        }
        res.addAll(help);
        return res;
    }
}
