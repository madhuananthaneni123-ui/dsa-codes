class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int j=0,i=0;
        int win=s1.length();
        HashMap<Character,Integer> ht=new HashMap<>();
       for(int k=0;k<win;k++){
           char c=s2.charAt(k);
            ht.put(c,ht.getOrDefault(c,0)+1);
        }
        if(hm.equals(ht)) return true;
         for(int k=win;k<s2.length();k++){
            char c=s2.charAt(i);
            ht.put(c,ht.get(c)-1);
            if(ht.get(c)==0) ht.remove(c);
            char in=s2.charAt(k);
            ht.put(in,ht.getOrDefault(in,0)+1);
            if(hm.equals(ht)) return true;
            i++;
            }
            return false;
          }
}
