class Solution {
    static boolean sol(int in,int tar,Boolean[][] dp,int[] arr){
        if(tar==0) return true;
        if(in==0){
            return arr[0]==tar;
        }
        if(dp[in][tar]!=null) return dp[in][tar];
        boolean nottake=sol(in-1,tar,dp,arr);
        boolean take=false;
        if(tar>=arr[in]){
            take=sol(in-1,tar-arr[in],dp,arr);
        }
        return dp[in][tar]=take || nottake;
    }
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n=arr.length;
        Boolean[][] dp=new Boolean[n][sum+1];
        return sol(n-1,sum,dp,arr);
    }
}
