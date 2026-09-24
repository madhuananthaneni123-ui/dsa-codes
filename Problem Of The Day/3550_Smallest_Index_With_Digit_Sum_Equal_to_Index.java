class Solution {
    int sol(int di) {
        int sum=0;
        while(di!=0){
            sum+=di%10;
            di/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(sol(nums[i])==i) return i;
        }
        return -1;
    }
}
