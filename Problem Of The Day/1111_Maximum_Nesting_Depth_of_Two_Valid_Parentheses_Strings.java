class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int[] ans=new int[n];
        int ac=1,bc=0;
        for(int i=0;i<n;i++){
            char c=seq.charAt(i);
            if(c=='('){
                ++bc;
                ans[i]=bc%2;
            }
            else{
                ans[i]=bc%2;
                bc--;
            }
        
        }
        return ans;
    }
}
