class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i:nums) ans^=i;
        int g1=0,g2=0;
        int bit=ans&(-ans);
        for(int i=0;i<n;i++){
            if((bit&nums[i])==0) g1^=nums[i];
            else g2^=nums[i];
        }
        return new int[]{g1,g2};
    }
}
