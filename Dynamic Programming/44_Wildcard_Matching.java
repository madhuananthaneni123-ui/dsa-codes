class Solution {
    boolean sol(int i,int j,String s,String p,Boolean[][] dp) {
        if(i<0){
            while(j>=0) {
                if(p.charAt(j)!='*') return false;
                j--;
            }
            return true;
        }
        if(j<0){
            return i<0;
        }
        if(dp[i][j]!=null) return dp[i][j];
        if(p.charAt(j)=='?'||p.charAt(j)==s.charAt(i)) return dp[i][j]=sol(i-1,j-1,s,p,dp);
        if(p.charAt(j)=='*'){
           boolean not=sol(i,j-1,s,p,dp);
           boolean take=sol(i-1,j,s,p,dp);
           return dp[i][j]=not|| take;
        }
        return dp[i][j]=false;
    }
    public boolean isMatch(String s, String p) {
        int n=s.length();
        int m=p.length();
        Boolean[][] dp=new Boolean[n][m];
        return sol(n-1,m-1,s,p,dp);
    }
}
