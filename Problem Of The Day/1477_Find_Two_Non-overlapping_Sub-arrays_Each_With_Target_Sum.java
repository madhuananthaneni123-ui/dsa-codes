class Solution {
    public int minSumOfLengths(int[] arr, int t) {
        int n=arr.length;
        int inf=Integer.MAX_VALUE/2;
        int[] dp=new int[n];
        Arrays.fill(dp,inf);
        int ans=inf;
        int sum=0,j=0;
        for(int i=0;i<n;i++) {
            sum+=arr[i];
            while(sum>t){
                sum-=arr[j++];
            }
            if(i>0) dp[i]=dp[i-1];
            if(sum==t) {
                int len=i-j+1;
                if(j>0 && dp[j-1]!=inf){
                    ans=Math.min(ans,len+dp[j-1]);
                }
                dp[i]=Math.min(len,dp[i]);
            }
        }
        return ans==inf?-1:ans;
     }
}
