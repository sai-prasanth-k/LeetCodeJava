package Arrays.MaximumWaterContainer;

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left  = 0 ;
        int right = height.length-1;
        while(left<right){
            int width = right - left;
            int minheight = Math.min(height[left],height[right]);
            int area = width * minheight ;
            max = Math.max(max,area);
            if(height[left]< height[right]){
                left++;
            }else if(height[left]> height[right]){
                right--;
            }else {
                right--;
                left++;
            }
        }
        return max;
    }
}
