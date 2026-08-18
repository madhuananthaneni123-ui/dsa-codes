class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        if(k==n){
            int max=nums[0];
            for(int i:nums){
                max=Math.max(max,i);
            }
            return max;
        }
        int[] co=new int[51];
        for(int i:nums){
            co[i]++;
        }
        if(k==1){
            for(int i=50;i>=0;i--){
                if(co[i]==1) return i;
            }
        }
        int res=-1;
        if(co[nums[0]]==1){
            res=Math.max(res,nums[0]);
        }
        if(co[nums[n-1]]==1){
            res=Math.max(res,nums[n-1]);
        }
        return res;
    }
}
