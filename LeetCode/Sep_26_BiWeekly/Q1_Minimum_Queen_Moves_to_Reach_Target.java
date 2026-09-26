class Solution {
    public int minQueenMoves(int[] s, int[] t) {
        int x1=s[0],x2=t[0],y1=s[1],y2=t[1];
        if(x1==x2 && y1==y2) return 0;
        else if(x1==x2 || y1==y2) return 1;
        else if(Math.abs(x1-x2)==Math.abs(y1-y2)) return 1;
        return 2;
    }
}
