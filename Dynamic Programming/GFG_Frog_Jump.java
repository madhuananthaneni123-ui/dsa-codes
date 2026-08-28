class Solution {
    int minCost(int[] h) {
        // code here
        int n=h.length;
        if(n==1) return 0;
        int[] dp=new int[n];
        dp[0]=0;
        dp[1]=Math.abs(h[1]-h[0]);
        for(int i=2;i<n;i++){
            dp[i]=Math.min(dp[i-1]+Math.abs(h[i-1]-h[i]),dp[i-2]+Math.abs(h[i-2]-h[i]));
        }
        return dp[n-1];
    }
}
