class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int i=0,n=arr.length;
        int max=0;
        for(int j=0;j<n;j++){
            if(arr[j]==0) k--;
            while(k<0){
                if(arr[i]==0) k++;
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}
