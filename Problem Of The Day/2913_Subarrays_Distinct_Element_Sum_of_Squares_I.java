class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                HashSet<Integer> hm=new HashSet<>();
                for(int k=i;k<=j;k++){
                    hm.add(nums.get(k));
                }
                cnt+=hm.size()*hm.size();
            }
        }
        return cnt;
    }
}
