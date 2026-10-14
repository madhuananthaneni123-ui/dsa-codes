class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder st=new StringBuilder();
        boolean flag=true;
        while(num!=0){
            if(sum>9 && num<2){
                flag=false;
                break;
            }
            if(sum>9){
                sum-=9;
                st.append('9');
            }
            else{
                st.append((char)(sum+'0'));
                sum=0;
            }
            num--;
        }
        if(!flag) return "";
        return st.toString();
    }
}
