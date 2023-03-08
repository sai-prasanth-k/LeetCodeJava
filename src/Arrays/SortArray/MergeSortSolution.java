package Arrays.SortArray;

public class MergeSortSolution {
        public int[] sortArray(int[] nums) {
            mergeSort(nums,0,nums.length-1);
            return nums;
        }

        public void mergeSort(int[] nums,int left,int right){
            if(left>=right) return;
            int mid = (left+right)/2;
            mergeSort(nums, left, mid);
            mergeSort(nums,mid+1,right);
            merge(nums,left,right,mid);
        }

        public void merge(int[] nums, int left, int right,int mid){
            int[] res = new int[right-left+1];
            int i = left, j = mid+1, k = 0;
            while(i<=mid && j<=right){
                if(nums[i]<=nums[j]) {
                    res[k++] = nums[i++];
                }else {
                    res[k++] = nums[j++];
                }

            }
            while(i<=mid){
                res[k++] = nums[i++];
            }
            while(j<=right){
                res[k++] = nums[j++];
            }

            for(int m = 0 ;m<k;m++){
                nums[left+m] = res[m];
            }
        }
}
