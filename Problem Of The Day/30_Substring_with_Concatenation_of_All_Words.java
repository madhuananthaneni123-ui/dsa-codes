class Solution {
    void help(int len,HashMap<String,Integer> hm,String s){
        for(int i=0;i<s.length();i+=len){
            String h=s.substring(i,i+len);
            hm.put(h,hm.getOrDefault(h,0)+1);
        }
    }
    public List<Integer> findSubstring(String s, String[] words) {
        HashMap<String,Integer> hw=new HashMap<>();
        for(String e:words){
            hw.put(e,hw.getOrDefault(e,0)+1);
        }
        int k=words[0].length();
        int len=k*words.length;
        int j=len-1;
        int i=0;
        List<Integer> li=new ArrayList<>();
        while(j<s.length()){
            String l=s.substring(i,j+1);
            HashMap<String,Integer> hs=new HashMap<>();
            help(k,hs,l);
            if(hs.equals(hw)) li.add(i);
            j++;
            i++;
        }
        return li;
    }
}
