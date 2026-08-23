class Solution {
    int maxProduct(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        int p1=1;
        int p2=1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(p1==0) p1=1;
            if(p2==0) p2=1;
            p1*=arr[i];
            p2*=arr[n-i-1];
            max=Math.max(max,Math.max(p1,p2));
        }
        return max;
    }
}
