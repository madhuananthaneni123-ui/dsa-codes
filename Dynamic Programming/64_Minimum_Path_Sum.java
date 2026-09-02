class Solution {
    public int minPathSum(int[][] g) {
        int n=g.length;
        int m=g[0].length;
        if(n==1 && m==1) return g[0][0];
        int[][] dp=new int[n][m];
        int run=g[0][0];
        for(int i=1;i<n;i++){
            run+=g[i][0];
            dp[i][0]=run;
        }
        run=g[0][0];
        for(int i=1;i<m;i++){
            run+=g[0][i];
            dp[0][i]=run;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                dp[i][j]=g[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n-1][m-1];
    }
}
