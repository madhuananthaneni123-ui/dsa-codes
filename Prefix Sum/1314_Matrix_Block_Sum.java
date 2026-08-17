class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int r=mat.length;
        int c=mat[0].length;
        int[][] ans=new int[r][c];
        for(int i=0;i<r;i++){
            ans[i][0]=mat[i][0];
        }
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                ans[i][j]=mat[i][j]+ans[i][j-1];
            }
        }
        for(int i=1;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]+=ans[i-1][j];
            }
        }
        int cnt=0;
        int[][] pre=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int mini=i-k;
                int minj=j-k;
                int maxi=i+k;
                int maxj=j+k;
                if(mini<0) mini=0;
                if(minj<0) minj=0;
                if(maxi>=r) maxi=r-1;
                if(maxj>=c) maxj=c-1;
                int w=ans[maxi][maxj];
                if(mini-1>=0){
                    w-=ans[mini-1][maxj];
                }
                if(minj-1>=0){
                    w-=ans[maxi][minj-1];
                }
                if(mini>0 && minj>0) w+=ans[mini-1][minj-1];
                pre[i][j]=w;
            }
        }
        return pre;
    }
}
