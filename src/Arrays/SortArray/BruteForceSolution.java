package Arrays.SortArray;

public class BruteForceSolution {
        public int[] sortArray(int[] nums) {
            int[] res = new int[nums.length];

            for(int i = 0; i<nums.length;i++){
                for(int j = i+1; j<nums.length;j++){
                    if(nums[i]<nums[j]){
                        res[i] = nums[i];
                    }else if(nums[i]>nums[j]){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        res[i] = nums[i];
                    }
                }
            }
            return nums;
        }
}
