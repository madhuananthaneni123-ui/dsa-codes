// Memeoization
class Solution {
    int help(int i,int j,List<List<Integer>> t,int[][] dp){
        if(i==t.size()-1) return t.get(i).get(j);
        if(dp[i][j]!=Integer.MIN_VALUE) return dp[i][j];
        int d=t.get(i).get(j)+help(i+1,j,t,dp);
        int dg=t.get(i).get(j)+help(i+1,j+1,t,dp);
        return dp[i][j]=Math.min(d,dg);
    }
    public int minimumTotal(List<List<Integer>> t) {
        int n=t.size();
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=Integer.MIN_VALUE;
            }
        }
        return help(0,0,t,dp);
    }
}
// Tabulation
public int minimumTotal(List<List<Integer>> t) {
        int n=t.size();
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            dp[n-1][i]=t.get(n-1).get(i);
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int d=t.get(i).get(j)+dp[i+1][j];
                int dg=t.get(i).get(j)+dp[i+1][j+1];
                dp[i][j]=Math.min(d,dg);
            }
        }
        return dp[0][0];
    }
// Space Optimization
 public int minimumTotal(List<List<Integer>> t) {
        int n=t.size();
        int[] cur=new int[n];
        for(int i=0;i<n;i++){
            cur[i]=t.get(n-1).get(i);
        }
        for(int i=n-2;i>=0;i--){
            int[] prev=new int[n];
            for(int j=i;j>=0;j--){
                int d=t.get(i).get(j)+cur[j];
                int dg=t.get(i).get(j)+cur[j+1];
                prev[j]=Math.min(d,dg);
            }
            cur=prev;
        }
        return cur[0];
    }
