package twoSums;

import java.util.Map;

public class HashMap {
        public int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];

            Map<Integer, Integer> map = (Map<Integer, Integer>) new HashMap();

            for (int i = 0; i < nums.length; i++) {

                if (map.containsKey(nums[i])) {
                    result[0] = map.get(nums[i]);
                    result[1] = i;
                }
                map.put(target - nums[i], i);
            }
            return result;
        }
}
