class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int[][] trans=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                trans[j][i]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            int c=n-1;
           for(int j=0;j<n;j++){
                matrix[i][j]=trans[i][c];
                c--;
           }
        }
        
    }
}
