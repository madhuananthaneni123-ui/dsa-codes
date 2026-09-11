import java.util.* ;
import java.io.*; 
public class Solution {
	static int mod=(int)(1e9+7);
	static int sol(int[] arr,int sum,int n){
			int[][] dp=new int[n][sum+1];
			if(arr[0]==0) dp[0][0]=2;
			else dp[0][0]=1;
			if( arr[0]!=0 && arr[0]<=sum) dp[0][arr[0]]=1;
			for(int i=1;i<n;i++){
				for(int t=0;t<=sum;t++){
					int not=dp[i-1][t];
					int take=0;
					if(arr[i]<=t) take=dp[i-1][t-arr[i]];
					dp[i][t]=(take+not)%mod;
				}
			}
			return dp[n-1][sum];
	}
	public static int countPartitions(int n, int d, int[] arr) {
		// Write your code here.
		int sum=0;
		for(int i:arr) sum+=i;
		if(sum-d<0 || (sum-d)%2==1) return 0;
		return sol(arr,(sum-d)/2,n);
	}
}
