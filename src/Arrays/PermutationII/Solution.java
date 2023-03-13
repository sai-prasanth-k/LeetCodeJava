package Arrays.PermutationII;

import  java.util.*;
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(res, new ArrayList<>(), nums,new boolean[nums.length]);
        return res;
    }

    public void backTrack(List<List<Integer>> res, List<Integer> tempRes, int[] nums , boolean[] occured){
        if(tempRes.size() == nums.length){
            res.add(new ArrayList<>(tempRes));
        }else{
            for(int i = 0 ; i< nums.length; i++){
                if(occured[i] || i > 0 && nums[i] == nums[i-1] && !occured[i-1]) continue;
                occured[i] = true;
                tempRes.add(nums[i]);
                backTrack(res,tempRes, nums,occured);
                occured[i] = false;
                tempRes.remove(tempRes.size() -1);

            }
        }
    }
}
