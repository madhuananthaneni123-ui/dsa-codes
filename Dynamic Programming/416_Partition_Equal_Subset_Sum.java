class Solution {
    boolean sol(int i,int cur,int tar,int[] nums,Boolean[][] dp){
        if(cur==tar) return true;
        if(i<0 || cur>tar) return false;
        if(dp[i][cur]!=null) return dp[i][cur];
        boolean nottake=sol(i-1,cur,tar,nums,dp);
        boolean take=sol(i-1,cur+nums[i],tar,nums,dp);;
        return dp[i][cur]=nottake || take;
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i:nums) sum+=i;
        Boolean[][] dp=new Boolean[n][(sum/2)+1];
        if(sum%2==1) return false;
        return sol(n-1,0,sum/2,nums,dp);
    }
}
