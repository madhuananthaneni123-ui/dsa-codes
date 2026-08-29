class Solution {
    int unvisitedLeaves(int arr[], int k) {
        // code here
        int[] ans=new int[k+1];
        int n=arr.length;
        for(int i=0;i<n;i++){
            int mul=arr[i];
            for(int j=mul;j<=k;j+=mul){
                ans[j]++;
            }
        }
        int cnt=0;
        for(int i=1;i<=k;i++){
            if(ans[i]==0) cnt++;
        }
        return cnt;
    }
}
