package Arrays.LargestLocalValueInAMatrix;

class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] ans = new int[grid.length-2][grid.length-2];

        for(int i = 0 ; i < ans.length;++i){
            for(int j = 0 ; j < ans.length;++j){
                int max = Integer.MIN_VALUE;

                for(int row = i ; row < i+3;++row){
                    for(int column = j ; column < j+3 ; ++column){
                        max = Math.max(max,grid[row][column]);
                    }
                }
                ans[i][j] = max;
            }
        }
        return ans;
    }
}
