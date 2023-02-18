package Strings.JewelsAndStones;

import java.util.HashMap;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int jewelsLen = jewels.length();
        int stoneLen = stones.length();
        int count = 0;
        for(int i = 0; i< stoneLen; i++){
            for(int j =0;j < jewelsLen;j++){
                if(jewels.charAt(j) == stones.charAt(i)){
                    count++;
                }
            }
        }
        return count;
    }
}
