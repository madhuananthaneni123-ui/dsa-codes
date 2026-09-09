class Solution {
    public long countCommas(long n) {
        long ans=0;
        if(n>=1000) ans+=n-999;
        if(n>=1e6)  ans+=n-999999;
        if(n>=1e9)  ans+=n-999999999;
        if(n>=1e12) ans+=n-999999999999L;
        if(n>=1e15) ans+=n-999999999999999L;
        return ans;
    }
}
