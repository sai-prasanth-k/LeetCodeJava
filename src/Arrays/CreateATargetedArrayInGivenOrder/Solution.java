package Arrays.CreateATargetedArrayInGivenOrder;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list =new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        int[] target=new int[list.size()];
        for(int i=0;i<nums.length;i++){
            target[i]=list.get(i);
        }
        return target;
    }
}