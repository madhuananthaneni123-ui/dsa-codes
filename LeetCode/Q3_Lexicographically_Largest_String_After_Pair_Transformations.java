class Solution {
    public String[] largestString(int[] nums) {
        int[] alp=new int[26];
        alp[0]=1;
        for(int i=1;i<26;i++){
            alp[i]=alp[i-1]*2;
        }
        String ans[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            StringBuilder st=new StringBuilder();
            for(int j=25;j>=0;j--){
                while(val>=alp[j]){
                    char s=(char)(j+'a');
                    st.append(s);
                    val-=alp[j];
                }
            }
            ans[i]=st.toString();
        }
        return ans;
    }
}
