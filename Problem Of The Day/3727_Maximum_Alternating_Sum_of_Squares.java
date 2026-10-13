class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int mid=n/2;
        long sum1=0;
        long sum2=0;
        for(int i=0;i<mid;i++){
            sum1+=nums[i]*nums[i];
        }
        for(int i=mid;i<n;i++) sum2+=nums[i]*nums[i];
        return sum2-sum1;
    }
}
