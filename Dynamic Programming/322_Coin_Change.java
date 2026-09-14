class Solution {
    int sol(int ind,int tar,int[][] dp,int[] c){
        if(ind==0) {
            if(tar%c[ind]==0) return tar/c[ind];
            return (int)1e9;
        }
        if(dp[ind][tar]!=-1) return dp[ind][tar];
        int not=sol(ind-1,tar,dp,c);
        int take=Integer.MAX_VALUE;
        if(c[ind]<=tar) take=1+sol(ind,tar-c[ind],dp,c);
        return dp[ind][tar]=Math.min(take,not);
    }
    public int coinChange(int[] c, int amount) {
        int[][] dp=new int[c.length][amount+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        int n= sol(c.length-1,amount,dp,c);
        if(n==1e9) return -1;
        return n;
    }
}
