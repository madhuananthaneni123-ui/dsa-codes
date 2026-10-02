class Solution {
    int sol(int i,int b,int[] p,int[][] dp){
        if(i>=p.length) return 0;
        if(dp[i][b]!=-1) return dp[i][b];
        int pro=0;
        if(b==1){
            pro=Math.max(-p[i]+sol(i+1,0,p,dp),sol(i+1,1,p,dp));
        }
        else{
            pro=Math.max(p[i]+sol(i+2,1,p,dp),sol(i+1,0,p,dp));
        }
        return dp[i][b]=pro;
    }
    public int maxProfit(int[] p) {
        int n=p.length;
        int[][] dp=new int[n][2];
        for(int[] i:dp) Arrays.fill(i,-1);
        return sol(0,1,p,dp);
    }
}
