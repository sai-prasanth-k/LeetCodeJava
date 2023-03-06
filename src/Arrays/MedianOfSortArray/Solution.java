package Arrays.MedianOfSortArray;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int res = 0 ;
        int[] arr = new int[nums1.length+nums2.length];

        for(int i = 0 ; i < nums1.length;i++){
            arr[res++] = nums1[i];
        }
        for(int i = 0 ; i < nums2.length;i++){
            arr[res++] = nums2[i];

        }

        Arrays.sort(arr);

        int mid = arr.length/2;

        if(arr.length % 2 == 0){
            return (double)(arr[mid-1] + arr[mid])/2;
        }
        return arr[mid];
    }
}
