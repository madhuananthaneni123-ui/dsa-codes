class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int[] rigth=new int[n];
        int[] left=new int[n];
        left[0]=h[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(h[i],left[i-1]);
        }
        rigth[n-1]=h[n-1];
        for(int i=n-2;i>=0;i--){
            rigth[i]=Math.max(rigth[i+1],h[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int min=Math.min(left[i],rigth[i]);
            int c=0;
            if(min-h[i]<=0) c=0;
            else c=min-h[i];
            ans+=c;
        }
        return ans;
    }
}
