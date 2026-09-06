class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        long left=0;
        long right=0;
        for(int i=0;i<n/2;i++){
            left+=nums[i];
        }
        for(int i=n/2;i<n;i++) right+=nums[i];
        int i=0,j=0,cnt=0;
        for(int k=0;k<n;k++){
            if(left>right) cnt++;
            i=k;
            j=(k+n/2)%n;
            left-=nums[i];
            left+=nums[j];
            right-=nums[j];
            right+=nums[i];
        }
        return cnt;
    }
}
