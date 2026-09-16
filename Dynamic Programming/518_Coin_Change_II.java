class Solution {
    int sol(int i,int t,int[] c,int[][] dp){
        if(t==0) return 1;
        if(i==0){
            if(t%c[i]==0) return 1;
            return 0;
        }
        if(dp[i][t]!=-1) return dp[i][t];
        int not=sol(i-1,t,c,dp);
        int take=0;
        if(c[i]<=t){
            take=sol(i,t-c[i],c,dp);
        }
        return dp[i][t]=not+take;
    }
    public int change(int a, int[] c) {
        int n=c.length;
        int[] dp=new int[a+1];
        for(int i=0;i<=a;i++){
            if(i%c[0]==0) dp[i]=1;
            else dp[i]=0;
        }
        for(int i=1;i<n;i++){
            for(int t=c[i];t<=a;t++){
                dp[t]+=dp[t-c[i]];
            }
        }
        return dp[a];
    }
}
