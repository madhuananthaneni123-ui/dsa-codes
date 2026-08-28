class Solution {
    static int[] dp;
    static{
        dp=new int[41];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<41;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
    }
    public static int countWays(int n) {
        // code here
      return dp[n];
    }
}
