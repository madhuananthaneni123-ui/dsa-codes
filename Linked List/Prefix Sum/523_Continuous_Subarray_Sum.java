class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Long,Integer> hm=new HashMap<>();
        int n=nums.length;
        long sum=0;
        hm.put(0L,-1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            long rem=sum%k;
            if(hm.containsKey(rem)){
                if(i-hm.get(rem)>=2){
                    return true;
                }
            }
                else{
                hm.put(rem,i);
                }
            
        }
        return false;
    }
}
