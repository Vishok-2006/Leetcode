class Solution {
    public int maxProfit(int[] arr) {
        int m=Integer.MAX_VALUE;
        int n=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<m){
                m=arr[i];
            }
            else{
                n=Math.max(n,arr[i]-m);
            }
        }
        return n;
    }
}