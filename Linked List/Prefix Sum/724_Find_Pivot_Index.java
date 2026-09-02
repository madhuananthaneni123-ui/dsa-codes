class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] pre=new int[n+1];
        pre[1]=nums[0];
        int[] suf=new int[n+1];
        suf[n-1]=nums[n-1];
        int pos=-1;
        for(int i=2;i<n+1;i++){
            pre[i]=pre[i-1]+nums[i-1];
            System.out.print(pre[i]+" ");
        }
        for(int i=n-2;i>=0;i--){
            suf[i]=suf[i+1]+nums[i];
            System.out.print(suf[i]+" ");
        }
        for(int i=0;i<n;i++){
            if(pre[i]==suf[i+1]){
                pos=i;
                break;
            }
        }
        return pos;
    }
}