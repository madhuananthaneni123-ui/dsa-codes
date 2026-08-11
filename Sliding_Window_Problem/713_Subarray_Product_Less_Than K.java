class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int i=0,sum=0;
        long pro=1;
        for(int j=0;j<n;j++){
            if(nums[j]>=k){
                i=j+1;
                pro=1;
                continue;
            }
            pro*=nums[j];
            while(pro>=k && i<j){
                pro/=nums[i];
                i++;
            }
            sum+=j-i+1;
        }
        return sum;
    }
}
