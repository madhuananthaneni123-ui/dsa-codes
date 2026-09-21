class Solution {
    int sol(int i,int[] nums,int[] dp) {
        if(i>=nums.length-1) return 0;
        if(dp[i]!=-1) return dp[i];
        int min=(int)1e6;
        for(int j=i+1;j<=i+nums[i];j++){
            min=Math.min(min,sol(j,nums,dp));
        }
        return dp[i]=1+min;
    }
    public int jump(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return sol(0,nums,dp);
    }
}
