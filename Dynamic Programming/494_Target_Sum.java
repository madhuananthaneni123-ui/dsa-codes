class Solution {
    public int findTargetSumWays(int[] nums, int t) {
        int sum=0,n=nums.length;
        for(int i:nums) sum+=i;
        int d=(sum-t)/2;
        if(sum-t<0) return 0;
        if((sum-t)%2==1) return 0;
        int[][] dp=new int[n][d+1];
        if(nums[0]==0){
            dp[0][0]=2;
        }
        else{
            dp[0][0]=1;
            if(nums[0]<=d) dp[0][nums[0]]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=d;j++){
                int not=dp[i-1][j];
                int take=0;
                if(nums[i]<=j) take=dp[i-1][j-nums[i]];
                dp[i][j]=not+take;
            }
        }
        return dp[n-1][d];
    }
}
