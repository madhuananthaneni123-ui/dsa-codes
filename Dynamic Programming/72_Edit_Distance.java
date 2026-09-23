class Solution {
    int sol(int i,int j,String s1,String s2,int[][] dp){
        if(i>=s1.length() ) return s2.length()-j;
        if(j>=s2.length() ) return s1.length()-i;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=sol(i+1,j+1,s1,s2,dp);
        }
        int m1=1+sol(i+1,j,s1,s2,dp);
        int m2=1+sol(i,j+1,s1,s2,dp);
        int m3=1+sol(i+1,j+1,s1,s2,dp);
        return dp[i][j]=Math.min(m1,Math.min(m2,m3));
    }
    public int minDistance(String w1, String w2) {
        int n=w1.length();
        int m=w2.length();
        int[][] dp=new int[n][m];
        for(int[] i:dp) Arrays.fill(i,-1);
        return sol(0,0,w1,w2,dp);
    }
}
