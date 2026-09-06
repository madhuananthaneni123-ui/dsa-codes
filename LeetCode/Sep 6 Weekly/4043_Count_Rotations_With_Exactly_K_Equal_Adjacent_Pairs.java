class Solution {
    int sol(String  s){
        int soc=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)) soc++;
        }
        return soc;
    }
    public int countRotations(String s, int k) {
        String ans=s+s;
        int n=s.length();
        int j=0,cnt=0;
        for(int i=n;i<ans.length();i++){
         int so=sol(ans.substring(j,i));
            if(so==k) cnt++;
            j++;
        }
        return cnt;
    }
}
