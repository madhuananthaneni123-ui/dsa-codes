class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if((xor^nums[i])==0) cnt++;
            xor^=nums[i];
        }
        if(cnt==nums.length) return 0;
        if(xor==0) return nums.length-1;
        return nums.length;
    }
}