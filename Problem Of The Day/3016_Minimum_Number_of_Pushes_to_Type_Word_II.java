class Solution {
    public int minimumPushes(String w) {
        int n=w.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            char c=w.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        System.out.println(hm.size());
        List<Integer> li=new ArrayList<>();
        for(char q:hm.keySet()){
            li.add(hm.get(q));
        }
        Collections.sort(li,Collections.reverseOrder());
        int ans=0;
        for(int i=0;i<hm.size();i++){
            ans+=li.get(i)*((i/8)+1);
        }
        return ans;
    }
}
