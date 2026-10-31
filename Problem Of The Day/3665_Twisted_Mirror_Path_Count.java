class Solution {
    public int uniquePaths(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        long dp[][][]=new long[n][m][2];
        long mod=(long)(1e9+7);
        dp[0][0][0]=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    long ways=(dp[i][j][1]+dp[i][j][0])%mod;
                    if(i+1<n){
                        dp[i+1][j][1]=(dp[i+1][j][1]+ways)%mod;
                    }
                    if(j+1<m){
                        dp[i][j+1][0]=(dp[i][j+1][0]+ways)%mod;
                    }
                }
                else{
                    if(i+1<n){
                        dp[i+1][j][1]=(dp[i+1][j][1]+dp[i][j][0])%mod;
                    }
                    if(j+1<m){
                        dp[i][j+1][0]=(dp[i][j+1][0]+dp[i][j][1])%mod;
                    }
                }
            }
        }
        return (int)((dp[n-1][m-1][0]+dp[n-1][m-1][1])%mod);
    }
}
