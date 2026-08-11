class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> hm=new HashSet<>();
        int n=nums.length;
        for(int i:nums){
            hm.add(i);
        }
        int tot=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1) tot+=nums[i];
            else break;
        }
        while(hm.contains(tot)) tot++;
        return tot;
    }
}
