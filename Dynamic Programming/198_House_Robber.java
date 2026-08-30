class Solution {
    public int sol(int i,int[] dp,int[] nums){
        if(i==0) return nums[0];
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=nums[i]+sol(i-2,dp,nums);
        int skip=sol(i-1,dp,nums);
        dp[i]=Math.max(take,skip);
        return dp[i];
    }
    
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return sol(n-1,dp,nums);
    }
}
