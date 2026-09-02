class Solution {
    public int[] productExceptSelf(int[] nums) {
        long[] pre=new long[nums.length];
        long[] suf=new long[nums.length];
        pre[0]=1;
        suf[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            pre[i]=((long)pre[i-1]*nums[i-1]);
        }
        for(int i=nums.length-2;i>=0;i--){
            suf[i]=((long)suf[i+1]*nums[i+1]);
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=(int)(pre[i]*suf[i]);
        }
        return ans;
    }
}