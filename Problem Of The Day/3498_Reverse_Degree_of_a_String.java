class Solution {
    public int reverseDegree(String s) {
        int[] ans =new int[27];
        int cnt=26;
        for(int i=1;i<=26;i++){
            ans[i]=cnt;
            cnt--;
        }
        int c=0;
        for(int i=0;i<s.length();i++){
            char d=s.charAt(i);
            c+=(i+1)*ans[(d-'a')+1];
        }
        return c;
    }
}
