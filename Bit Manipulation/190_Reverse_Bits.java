class Solution {
    int get(int n,int k){
        return (n>>k)&1;
    }
    public int reverseBits(int n) {
        int c=31;
        int ans=0;
        for(int i=0;i<31;i++){
            int bit=get(n,i);
            ans|=bit<<c;
            c--;
        }
        return ans;
    }
}
