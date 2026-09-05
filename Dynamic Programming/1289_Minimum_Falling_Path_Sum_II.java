class Solution {
    public int minFallingPathSum(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] dp=new int[n][m];
        for(int i=0;i<m;i++){
            dp[0][i]=mat[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
            int left=Integer.MAX_VALUE;
            for(int k=0;k<m;k++){
                if(k!=j){
                left=Math.min(left,dp[i-1][k]);
                }
            }
            dp[i][j]=mat[i][j]+left;
        }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            ans=Math.min(ans,dp[n-1][i]);
        }
        return ans;
    }
}
