package Strings.NoOfSecurityBeamInBank;

class Solution {
    public int numberOfBeams(String[] bank) {
        int previousNum = 0;
        int ans = 0;

        for(String s: bank){
            int currentNum = 0;
            for(char c : s.toCharArray()){
                if(c == '1'){
                    currentNum++;
                }
            }

            if(currentNum > 0){
                ans+=(currentNum * previousNum);
                previousNum = currentNum;
            }
        }
        return ans;
    }
}
