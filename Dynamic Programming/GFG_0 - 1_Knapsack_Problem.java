class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=val.length;
        int[] prev=new int[W+1];
        for(int i=wt[0];i<=W;i++){
            prev[i]=val[0];
        }
        for(int i=1;i<n;i++){
            for(int j=W;j>=0;j--){
                int not=prev[j];
                int take=Integer.MIN_VALUE;
                if(wt[i]<=j) take=val[i]+prev[j-wt[i]];
                prev[j]=Math.max(not,take);
            }
        }
        return prev[W];
    }
}
