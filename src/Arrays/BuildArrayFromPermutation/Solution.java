package Arrays.BuildArrayFromPermutation;

class Solution {
    public int[] buildArray(int[] nums) {
        int res[] = new int[nums.length];

        for(int num : nums){
            res[num] = nums[nums[num]];
        }
        return res;
    }
}
