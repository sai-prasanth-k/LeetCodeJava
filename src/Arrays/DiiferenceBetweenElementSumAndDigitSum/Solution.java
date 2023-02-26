package Arrays.DiiferenceBetweenElementSumAndDigitSum;

class Solution {
    public int differenceOfSum(int[] nums) {
        int res= 0;
        int arr1 =0;
        int arr2 = 0;

        for(int num : nums){
            arr1+=num;

            String s = Integer.toString(num);
            for(int i = 0; i<s.length();i++){
                arr2+=s.charAt(i)- '0';
            }
        }
        return Math.abs(arr2-arr1);
    }
}
