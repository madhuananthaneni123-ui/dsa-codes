class Solution {
    boolean sol(int i,int sum,int[] s,Boolean[][] dp) {
        if(sum==0) return true;
        if(i==0) return s[0]==sum;
        if(dp[i][sum]!=null) return dp[i][sum];
        boolean not=sol(i-1,sum,s,dp);
        boolean take=false;
        if(s[i]<=sum){
         take=sol(i-1,sum-s[i],s,dp);
        }
        return dp[i][sum]=not || take;
    }
    public int lastStoneWeightII(int[] s) {
        int sum=0;
        for(int i:s) sum+=i;
        int n=s.length;
        if(n==1) return s[0];
        Boolean[][] dp=new Boolean[n][sum+1];
            for(int j=0;j<=sum;j++){
                sol(n-1,j,s,dp);
            }
         int min=Integer.MAX_VALUE;
         for(int i=0;i<=sum;i++){
            if(Boolean.TRUE.equals(dp[n-1][i])){
                int s2=sum-i;
                min=Math.min(min,Math.abs(s2-i));
            }
    }
    return min;
}
}
