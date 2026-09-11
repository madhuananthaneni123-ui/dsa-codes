class Solution {
    static int perfectSum(int[] arr, int tar) {
        // code here
        int n=arr.length;
        int[][] dp=new int[n][tar+1];
        if(arr[0]==0){
            dp[0][0]=2;
        }
        else{
            dp[0][0]=1;
        if(arr[0]<=tar) dp[0][arr[0]]=1;
        }
        int cnt=0;
        for(int i=1;i<n;i++){
            for(int t=0;t<=tar;t++){
                int not=dp[i-1][t];
                int take=0;
                if(arr[i]<=t) take=dp[i-1][t-arr[i]];
                dp[i][t]=take+not;
            }
        }
        return dp[n-1][tar];
    }
}
