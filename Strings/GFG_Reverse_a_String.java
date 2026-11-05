class Solution {
    public static String reverseString(String s) {
        // code here
        int n=s.length();
        String str="";
        for(int i=n-1;i>=0;i--){
            str+=s.charAt(i);
        }
        return str;
    }
}
