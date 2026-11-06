class Solution {
    public int binarySubstring(String s) {
        // code here
        int n=s.length();
        int ones=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1') ones++;
        }
        return ones*(ones-1)/2;
    }
}
