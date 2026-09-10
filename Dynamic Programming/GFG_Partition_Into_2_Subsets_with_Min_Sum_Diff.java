class Solution {
    public int minDifference(int arr[]) {
        // code here
        int tot=0;
        for(int i:arr){
            tot+=i;
        }
        int n=arr.length;
        boolean[][] dp=new boolean[n][tot+1];
        for(int i=0;i<n;i++) dp[i][0]=true;
        if(arr[0]<=tot) dp[0][arr[0]]=true;
        for(int i=1;i<n;i++){
            for(int t=1;t<=tot;t++){
                boolean not=dp[i-1][t];
                boolean take=false;
                if(arr[i]<=t) take=dp[i-1][t-arr[i]];
                dp[i][t]=take || not;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=tot;i++){
            if(dp[n-1][i]){
                int s1=i;
                int s2=tot-i;
                min=Math.min(min,Math.abs(s2-s1));
            }
        }
        return min;
    }
}
