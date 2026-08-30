class Solution {
    int sol(int i,int n,int[] nums){
        int prev2=0;
        int prev=nums[i];
        for(int j=i+1;j<=n;j++){
            int take=nums[j];
            if(j>1) take+=prev2;
            int skip=prev;
             int curi=Math.max(take,skip);
            prev2=prev;
            prev=curi;
        }
        return prev;
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        return Math.max(sol(0,n-2,nums),sol(1,n-1,nums));
    }
}
