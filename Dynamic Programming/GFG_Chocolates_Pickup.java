class Solution {
    int sol(int i,int j1,int j2,int[][] g,int[][][] dp){
        if(j1<0 || j1>=g[0].length || j2<0 || j2>=g[0].length) return 0;
        if(i==g.length-1){
            if(j1==j2) return g[i][j1];
            else return g[i][j1]+g[i][j2];
        }
        if(dp[i][j1][j2]!=-1) return dp[i][j1][j2];
        int max1=0,max2=0;
        if(j1!=j2) max1=g[i][j1]+g[i][j2];
        for(int k1=1;k1>=-1;k1--){
            for(int k2=-1;k2<=1;k2++){
                 int next=sol(i+1,j1+k1,j2+k2,g,dp);
                 max2=Math.max(max2,next);
            }
        }
        return dp[i][j1][j2]=max1+max2;
    }
    public int maxChocolate(int grid[][]) {
        // code here
        int n=grid.length;
        int m=grid[0].length;
        int[][][] dp=new int[n][m][m];
        for(int[][] i:dp){
            for(int[] j:i){
                Arrays.fill(j,-1);
            }
        }
        return sol(0,0,m-1,grid,dp);
    }
}
