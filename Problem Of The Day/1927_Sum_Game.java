class Solution {
    public boolean sumGame(String num) {
        int lcount=0;
        int rcount=0;
        int lsum=0;
        int rsum=0;
        int n=num.length();
        for(int i=0;i<n;i++){
            char c=num.charAt(i);
            if(i<n/2){
                if(c=='?'){
                lcount++;}
                else{
                    lsum+=(int)(c-'0');
                }
            }
            else{
                if(c=='?') rcount++;
                else rsum+=(int)(c-'0');
            }
        }
        if((lcount+rcount)%2==1) return true;
        int diff=lsum-rsum;
        int co=rcount-lcount;
    return 2*diff!=9*co;
    }
}
