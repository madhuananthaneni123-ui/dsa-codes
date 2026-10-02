class Solution {
    List<String> li=new ArrayList<>();
    void back(int o,int c,int n ,String s){
        if(s.length()==2*n){
            li.add(s);
            return;
        }
        if(o<n) back(o+1,c,n,s+"(");
        if(c<o) back(o,c+1,n,s+")");
    }
    public List<String> generateParenthesis(int n) {
        String s="";
        back(0,0,n,s);
        return li;
    }
}
