class Solution {
    int sol(int[] arr,int k,int o){
       int len=0;
       int sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<arr.length;i++){
             // System.out.print(arr[i]+" ");
            sum+=arr[i];
            int rem=sum%k;
            if(rem<0) rem+=k;
            if(hm.containsKey(rem)){
                int cur=i-hm.get(rem);
                len=Math.max(len,cur);
            }
            else{
                hm.put(rem,i);
            }
        }
        return len;
        
    }
    public int longestSubarray(int[] nums, int k) {
        int n=nums.length;
        int max=sol(nums,k,0);
        
        for(int i=0;i<n;i++){
            nums[i]=-1*nums[i];
            max=Math.max(max,sol(nums,k,i));
            nums[i]*=-1;
        }
        return max;
    }
}
