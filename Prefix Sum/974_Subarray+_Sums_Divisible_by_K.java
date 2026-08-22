class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        hm.put(0,1);
        int cnt=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int re=sum%k;
            if(re<0) re+=k;
            if(hm.containsKey(re)){
                cnt+=hm.get(re);
                hm.put(re,hm.get(re)+1);
            }
            else{
                hm.put(re,1);
            }
        }
        return cnt;
    }
}
