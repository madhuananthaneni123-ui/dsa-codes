class Solution {
    public int minBishopMoves(int[] s, int[] t) {
        int ss1=s[0];
        int ss2=s[1];
        int t1=t[0];
        int t2=t[1];
        int ans=-1;
        if((ss1+ss2+t1+t2)%2==0){
            if(Math.abs(ss1-t1)==Math.abs(ss2-t2)) ans=1;
            else ans=2;
        }
        return ans;
    }
}
