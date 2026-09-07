class Solution {
    public int distinctSubseqII(String s) {
        int mod=(int)(1e9+7);
        long[] ans=new long[26];
        long sum=0;
        for(char c:s.toCharArray()){
            long tot=(1+sum)%mod;
            int in=c-'a';
            sum=(sum+tot-ans[in]+mod)%mod;
            ans[in]=tot;
        }
        return (int)sum;
    }
}
