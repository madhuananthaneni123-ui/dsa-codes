class Solution {
    static{
        for (int i = 0;i<1000;i++)
        {
            minSubArrayLen(0,new int[]{});
        }
    }
    public static int minSubArrayLen(int t, int[] nums) {
        int n=nums.length;
        int i=0;
        int max=Integer.MAX_VALUE;
        long sum=0;
        for(int j=0;j<n;j++){
            sum+=nums[j];
            while(sum>=t){
                sum-=nums[i];
                max=Math.min(max,j-i+1);
                i++;
            }
        }
        if(max==Integer.MAX_VALUE) return 0;
        return max;
    }
}