class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1[0];
        boolean odd=false;
        for(int i:nums1){
            if(n>i) n=i;
            if(i%2==1) odd=true;
        }
        if(n%2==1) return true;
        return !odd;
    }
}
