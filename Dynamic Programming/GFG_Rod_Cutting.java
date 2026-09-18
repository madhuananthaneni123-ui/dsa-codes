class Solution {
    int sol(int i,int c,int[] arr,int[][] dp) {
        if(c==0) return 0;
        if(i==0) return c*arr[0];
        if(dp[i][c]!=-1) return dp[i][c];
        int not=sol(i-1,c,arr,dp);
        int take=0;
        if(i+1<=c) take=arr[i]+sol(i,c-(i+1),arr,dp);
        return dp[i][c]=Math.max(not,take);
    }
    public int cutRod(int[] price) {
        // code here
        int n=price.length;
        int[][] dp=new int[n][n+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return sol(n-1,n,price,dp);
    }
}
