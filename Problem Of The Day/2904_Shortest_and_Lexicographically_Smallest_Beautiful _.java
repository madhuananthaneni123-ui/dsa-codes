class Solution {
    public String compare(String a,String b){
        int l=a.compareTo(b);
        if(l<0) return a;
        else if(l>0) return b;
        return a;
    }
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int i=0,j=0;
        int len=Integer.MAX_VALUE;
        int cnt=0;
        String ans="";
        while(j<n){
            char c=s.charAt(j);
            if(c=='1') cnt++;
            while(cnt>=k){
                char st=s.charAt(i);
                if(st=='1') cnt--;
                if(len>=(j-i+1)){
                    if(len==j-i+1){
                        String l=compare(ans,s.substring(i,j+1));
                        ans=l;
                    }
                    else{
                    len=j-i+1;
                    ans=s.substring(i,j+1);
                    }
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}
