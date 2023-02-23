package Strings.PartitionLabels;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String s) {
        int len = s.length();
        List<Integer> ans = new ArrayList();
        int[] lastIndex = new int[26];
        for(int i =0;i<len;i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        int start = 0;
        int end = 0;
        for(int i = 0 ; i<len;i++){
            end = Math.max(end,lastIndex[s.charAt(i) - 'a']);
            if(i== end){
                ans.add(end-start+1);
                start = end +1;
            }
        }
        return ans;
    }
}