class pair{
    int x,y;
    pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->{
            return b.x-a.x;
        });
        int n=nums.length;
        int[] ans=new int[n-k+1];
        for(int i=0;i<k;i++){
            pq.offer(new pair(nums[i],i));
        }
        ans[0]=pq.peek().x;
        int i=0,cnt=1;
        for(int j=k;j<n;j++){
            pq.offer(new pair(nums[j],j));
            while(pq.peek().y<j-k+1){
                pq.poll();
                i++;
            }
            ans[cnt++]=pq.peek().x;
        }
        return ans;
    }
}
