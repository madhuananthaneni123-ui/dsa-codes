class Solution {
    int sol(int i,int j,String s1,String s2,int[][] dp) {
        if(j<0) return 1;
        if(i<0 && j>=0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int not=sol(i-1,j,s1,s2,dp);
        int take=0;
        if(s1.charAt(i)==s2.charAt(j)){
            take=sol(i-1,j-1,s1,s2,dp);
        }
        return dp[i][j]=not+take;
    }
    public int subseqCount(String s1, String s2) {
        // code here
        int n=s1.length();
        int m=s2.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++) {
        dp[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                int not=dp[i-1][j];
                int take=0;
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    take=dp[i-1][j-1];
                }
                dp[i][j]=not+take;
            }
        }
        return dp[n][m];
    }
}
