class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int n=s.length();
        int[] pa=new int[n];
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(i);
            }
            else if(c==')'){
                int ind=st.pop();
                pa[i]=ind;
                pa[ind]=i;
            }
        }
        StringBuilder str=new StringBuilder();
        for(int cur=0,dir=1;cur<n;cur+=dir){
            char c=s.charAt(cur);
            if(c=='('|| c==')'){
                cur=pa[cur];
                dir=-dir;
            }
            else str.append(c);
        }
        return str.toString();
    }
}
