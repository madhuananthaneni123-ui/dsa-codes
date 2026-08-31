class Solution {
    int sol(int day,int last,int[][] mat,int[][] dp){
        if(day==0){
          int max=0;
            for(int i=0;i<=2;i++){
                if(i!=last){
                    max=Math.max(max,mat[day][i]);
                }
            }
            return max;
        }
        int max=0;
        if(dp[day][last]!=-1) return dp[day][last];
        for(int i=0;i<=2;i++){
            if(i!=last){
                max=Math.max(max,mat[day][i]+sol(day-1,i,mat,dp));
            }
        }
        dp[day][last]=max;
        return dp[day][last];
        
    }
    public int maximumPoints(int mat[][]) {
        // code here
        int r=mat.length;
        int c=mat[0].length;
        int[][] dp=new int[r][c+1];
        for(int i=0;i<r;i++){
            for(int j=0;j<=c;j++){
                dp[i][j]=-1;
            }
        }
        
        return sol(r-1,c,mat,dp);
    }
}
