class Solution {
    int sol(int i,int b,int cap,int[] p,int[][][] dp) {
        if(i==p.length) return 0;
        if(cap==0) return 0;
        if(dp[i][b][cap]!=-1) return dp[i][b][cap];
        int pro=0;
        if(b==1){
            pro=Math.max(-p[i]+sol(i+1,0,cap,p,dp),sol(i+1,1,cap,p,dp));
        }
        else{
            pro=Math.max(p[i]+sol(i+1,1,cap-1,p,dp),sol(i+1,0,cap,p,dp));
        }
        return dp[i][b][cap]=pro;
    }
    public int maxProfit(int k, int[] p) {
        int n=p.length;
        int[][][] dp=new int[n][2][k+1];
        for(int[][] i:dp){
            for(int[] j:i) Arrays.fill(j,-1);
        }
        return sol(0,1,k,p,dp);
    }
}
