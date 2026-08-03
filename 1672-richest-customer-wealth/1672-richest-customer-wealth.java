class Solution {
    public int maximumWealth(int[][] accounts) {

        int wealth = 0;
        int m = accounts.length;
        int n = accounts[0].length;

        for(int i = 0; i < m; i++){
            int tempSum = 0;
            for(int j = 0; j < n; j++){
                tempSum += accounts[i][j];
            } 
            wealth = Math.max(wealth,tempSum);
        }

        return wealth;

    }
}