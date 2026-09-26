class Solution {
    public boolean canTransform(int[] s, int[] t) {
        long sum1=0;
        for(int i:s) sum1+=i;
        long sum2=0;
        for(int j:t) sum2+=j;
        return sum1==sum2;
    }
}
