package Arrays.RichestCustomerWealth;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] arr = new int[accounts.length];
        int res = 0;
        for(int i = 0 ; i< accounts.length;i++){
            int ans = 0;
            for(int j = 0; j<accounts[0].length;j++){
                ans+=accounts[i][j];
            }
            if(ans > res) {
                res = ans;
            }
        }
        return res;
    }
}
