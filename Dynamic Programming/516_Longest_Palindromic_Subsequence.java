class Solution {
    int sol(int i,int j,int[][] dp,String s1,String s2) {
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return 1+sol(i-1,j-1,dp,s1,s2);
        }
        return dp[i][j]=Math.max(sol(i-1,j,dp,s1,s2),sol(i,j-1,dp,s1,s2));

    }
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int[] i:dp) Arrays.fill(i,-1);
        return sol(n-1,n-1,dp,s,new StringBuilder(s).reverse().toString());
    }
}
