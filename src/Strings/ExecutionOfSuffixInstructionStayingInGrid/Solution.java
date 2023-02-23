package Strings.ExecutionOfSuffixInstructionStayingInGrid;

class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] ans = new int[s.length()];

        for(int i = 0 ; i <s.length();i++){
            int xIndex = startPos[0];
            int yIndex = startPos[1];
            int count = 0;

            for(int j= i; j<s.length();j++){
                char c =s.charAt(j);
                if( c == 'U') xIndex--;
                if( c == 'D') xIndex++;
                if( c == 'L') yIndex--;
                if( c == 'R') yIndex++;

                if(xIndex <0 || yIndex<0 || xIndex >=n || yIndex >= n) {
                    break;
                }else {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
