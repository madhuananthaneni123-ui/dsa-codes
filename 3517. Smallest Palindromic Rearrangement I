class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        boolean flag=false;
        if(n%2==1) flag=true;
        char f=' ';
        int[] ans=new int[26];
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            ans[c-'a']++;
        }
        StringBuilder st=new StringBuilder();
        for(int i=0;i<26;i++){
            if(ans[i]!=0){
            if(ans[i]%2==1) f=(char)(i+'a');
            int q=ans[i]/2;
            for(int j=0;j<q;j++){
            st.append((char)(i+'a'));
            }
            }
        }
        String temp=st.toString();
        if(flag){
        st.append(f);}
        for(int i=temp.length()-1;i>=0;i--){
            st.append(temp.charAt(i));
        }
        return st.toString();
    }
}
