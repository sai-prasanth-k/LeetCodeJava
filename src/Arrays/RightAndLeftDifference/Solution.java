package Arrays.RightAndLeftDifference;

class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] leftsum = new int[nums.length];
        int[] rightsum = new int[nums.length];
        int[] res = new int[nums.length];

        leftsum[0] = 0;
        rightsum[nums.length -1 ]  =0;

        for(int i = 0 ; i < nums.length -1; i++){
            leftsum[i+1] = leftsum[i] + nums[i];
        }
        for(int i = nums.length -1 ; i> 0;i--){
            rightsum[i-1] = rightsum[i] + nums[i];
        }
        for(int i = 0 ; i<nums.length;i++){
            res[i] =(int)Math.abs( leftsum[i] - rightsum[i]);
        }
        return res;
    }
}
