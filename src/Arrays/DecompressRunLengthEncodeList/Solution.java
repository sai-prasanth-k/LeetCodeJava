package Arrays.DecompressRunLengthEncodeList;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for(int i = 0 ; i< nums.length;i+=2){
            len+=nums[i];
        }
        int ind = 0;
        int[] res = new int[len];
        for(int i = 0 ; i<nums.length;i+=2){
            for(int j = 0 ; j <nums[i];j++){
                res[ind] = nums[i+1];
                ind++;
            }
        }

        return res;
    }
}
