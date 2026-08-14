class Solution {
    public int maximumLengthSubstring(String s) {
        int i=0;
        int n=s.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        int max=0;
        for(int j=0;j<n;j++){
            char c=s.charAt(j);
            hm.put(c,hm.getOrDefault(c,0)+1);
            while(hm.get(c)>2){
                char d=s.charAt(i);
                hm.put(d,hm.get(d)-1);
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}
