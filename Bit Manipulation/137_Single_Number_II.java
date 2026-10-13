class Solution {
    int get(int n,int k){
        return (n>>k)&1;
    }
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<32;i++){
            int c=0;
            for(int j:nums){
                if(get(j,i)==1) c++;
            }
            if(c%3!=0) ans|=1<<i;
        }
        return ans;
    }
}
