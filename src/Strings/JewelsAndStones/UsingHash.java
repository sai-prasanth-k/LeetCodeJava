package Strings.JewelsAndStones;

import java.util.HashSet;
import java.util.Set;

class UsingHash {
    public int numJewelsInStones(String jewels, String stones) {
        int jewelsLen = jewels.length();
        int stoneLen = stones.length();
        Set map = new HashSet();
        int count = 0;
        for(int i : jewels.toCharArray()){
            map.add(i);
        }
        for(int j: stones.toCharArray()){
            if(map.contains(j)) count++;
        }
        return count;
    }
}
