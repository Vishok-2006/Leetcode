class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int n=arr.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=0;j<n;j++){
                if(arr[i]>arr[j]){
                    s++;
                }
        }
          ans[i]=s;
        }
        return ans;
    }
}