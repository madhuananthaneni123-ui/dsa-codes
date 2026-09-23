class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i:nums) sum+=i;
        if(x>sum) return -1;
        int to=0,j=0;
        for(int i=0;i<n;i++){
            to+=nums[i];
            while(to>sum-x){
                to-=nums[j];
                j++;
            }
            if(sum-to==x){
                min=Math.min(min,n-(i-j+1));
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }
}
