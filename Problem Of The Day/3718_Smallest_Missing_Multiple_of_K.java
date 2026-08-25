class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=100;
        int arr[]=new int[101];
        for(int i:nums){
            arr[i]++;
        }
        int ans=k;
        int cnt=1;
        boolean flag=true;
        while(n-->0 && ans<=100){
            if(arr[ans]==0) return ans;
            cnt++;
            ans=k*cnt;
        }
        return ans;
    }
}
