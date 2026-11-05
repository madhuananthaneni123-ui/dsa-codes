class Solution {
    int firstOccurence(String txt, String pat) {
        // code here
        int n=txt.length();
        for(int i=0;i<n;i++){
            if(txt.substring(i).startsWith(pat)) return i;
        }
        return -1;
    }
}
