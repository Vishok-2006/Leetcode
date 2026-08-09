class Solution {
    public int countKDifference(int[] arr, int k) {
        int n=arr.length;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int max=Math.max(arr[i],arr[j]);
                int min=Math.min(arr[i],arr[j]);
                if(max-min==k){
                    c++;
                }
            }
        }
        return c;
    }
}