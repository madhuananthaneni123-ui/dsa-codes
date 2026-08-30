class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n==1) return 1;-
        int ff=Integer.MAX_VALUE,fs=Integer.MAX_VALUE,bf=Integer.MAX_VALUE,bs=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(nums[i]==min||nums[i]==max){
                if(!flag){
                    ff=i+1;
                    flag=true;
                }
                else{
                    fs=i-ff+1;
                    break;
                }
            }
        }
        flag=false;
        for(int i=n-1;i>=0;i--){
            if(nums[i]==min||nums[i]==max){
                if(!flag){
                    bf=n-i;
                    flag=true;
                }
                else{
                    bs=n-i-bf;
                    break;
                }
            }
        }
        int ans=Integer.MAX_VALUE;
        ans=Math.min(ans,Math.min(ff+fs,bf+bs));
        ans=Math.min(ans,ff+bf);
        return ans;
    }
}
