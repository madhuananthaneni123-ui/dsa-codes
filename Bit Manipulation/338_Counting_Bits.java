class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            int c=0;
            int h=i;
            while(h!=0){
                h&=(h-1);
                c++;
            }
            arr[i]=c;
        }
        return arr;
    }
}
