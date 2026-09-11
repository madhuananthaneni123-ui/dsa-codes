class Solution {
    public int totalNumbers(int[] d) {
        int n=d.length;
        boolean[] ans=new boolean[1000];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(d[i]==0) continue;
            for(int j=0;j<n;j++){
                if(j==i) continue;
                for(int k=0;k<n;k++){
                    if(k==i || k==j  || d[k]%2==1) continue;
                    int x=d[i]*100+d[j]*10+d[k];
                    if(!ans[x]){
                        ans[x]=true;
                    cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
