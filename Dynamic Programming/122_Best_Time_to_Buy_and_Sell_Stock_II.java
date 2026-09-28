class Solution {
    int sol(int i,int buy,int[] p,int[][] dp){
        if(i==p.length) return 0;
        if(dp[i][buy]!=-1) return dp[i][buy];
        int pro=0;
        if(buy==1){
            pro=Math.max(-p[i]+sol(i+1,0,p,dp),sol(i+1,1,p,dp));
        }
        else{
            pro=Math.max(p[i]+sol(i+1,1,p,dp),sol(i+1,0,p,dp));
        }
        return dp[i][buy]=pro;
    }
    public int maxProfit(int[] p) {
        int n=p.length;
        int[][] dp=new int[n+1][2];
        dp[n][0]=0;
        dp[n][1]=0;
        for(int i=n-1;i>=0;i--){
            for(int buy=0;buy<=1;buy++){
                int pro=0;
                if(buy==1){
                    pro=Math.max(-p[i]+dp[i+1][0],dp[i+1][1]);
                }
                else{
                    pro=Math.max(p[i]+dp[i+1][1],dp[i+1][0]);
                }
                dp[i][buy]=pro;
            }
        }
        return dp[0][1];
    }
}
