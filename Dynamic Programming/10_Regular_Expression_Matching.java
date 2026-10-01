class Solution {
    boolean sol(int i,int j,String s,String p,Boolean[][] dp) {
        if(j<0) return i<0;
        if(i<0){
            if(p.charAt(j)=='*') return sol(i,j-2,s,p,dp);
            return false;
        }
        if(dp[i][j]!=null) return dp[i][j];
        if(p.charAt(j)=='.' || s.charAt(i)==p.charAt(j)) return dp[i][j]=sol(i-1,j-1,s,p,dp);
        if(p.charAt(j)=='*'){
            boolean not=sol(i,j-2,s,p,dp);
            boolean take=false;
            if(p.charAt(j-1)=='.'||
            p.charAt(j-1)==s.charAt(i)){
                take=sol(i-1,j,s,p,dp);
            }
            return dp[i][j]=take || not;
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
