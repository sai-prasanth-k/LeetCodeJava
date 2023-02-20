package Arrays.SearchInsertPosition;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = 0;
        int len = nums.length;
        for(int i = 0; i< nums.length;i++){
            if(target == nums[i]){
                return i;
            }else {
                if(nums[i]>target){
                    return i;
                }
            }

        }
        return len;
    }
}
