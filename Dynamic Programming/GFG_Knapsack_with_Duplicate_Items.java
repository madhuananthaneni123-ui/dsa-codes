class Solution {
    int sol(int i,int c,int[] val,int[] wt,int[][] dp) {
        if(i==0){
             return (c/wt[i])*val[0];
        }
        if(dp[i][c]!=-1) return dp[i][c];
        int not=sol(i-1,c,val,wt,dp);
        int take=0;
        if(wt[i]<=c) {
            take=val[i]+sol(i,c-wt[i],val,wt,dp);
        }
        return dp[i][c]=Math.max(not,take);
    }
    public int knapSack(int val[], int wt[], int c) {
        // code here
        int n=val.length;
        int[][] dp=new int[n][c+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return sol(n-1,c,val,wt,dp);
    }
}
