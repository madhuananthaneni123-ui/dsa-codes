class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Long,Integer> hm=new HashMap<>();
        int n=arr.length;
        hm.put(0L,-1);
        long sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(hm.containsKey(sum)){
                max=Math.max(max,i-hm.get(sum));
            }
            else hm.put(sum,i);
        }
        return max;
    }
}
