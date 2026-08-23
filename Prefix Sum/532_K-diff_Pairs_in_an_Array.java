class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> hm=new HashSet<>();
        HashSet<Integer> h1=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(h1.contains(nums[i]-k)) hm.add(nums[i]);
            if(h1.contains(nums[i]+k)) hm.add(nums[i]+k);
            h1.add(nums[i]);
        }
        return hm.size();
    }
}
