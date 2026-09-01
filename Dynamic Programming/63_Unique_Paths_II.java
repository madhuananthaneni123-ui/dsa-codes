class Solution {
    public int uniquePathsWithObstacles(int[][] ob) {
        int n=ob.length;
        int m=ob[0].length;
        if( ob[0][0]==1 || ob[n-1][m-1]==1) return 0;
        if(n==1 && m==1) return 1;
        int[][] dp=new int[n][m];
        int obs=1;
        for(int i=1;i<n;i++){
            if(ob[i][0]==obs) break;
            else dp[i][0]=1;
        }
        for(int i=1;i<m;i++){
            if(ob[0][i]==obs) break;
            else dp[0][i]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(ob[i-1][j]!=obs) dp[i][j]+=dp[i-1][j];
                if(ob[i][j-1]!=obs) dp[i][j]+=dp[i][j-1];
            }
        }
        return dp[n-1][m-1];
    }
}
