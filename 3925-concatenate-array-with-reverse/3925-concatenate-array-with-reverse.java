class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n*2];
        int j=n-1;
        for(int i=0;i<n*2;i++){
            if( i<n ){
            arr[i]=nums[i];
            }
            else{
                arr[i]=nums[j];
                j--;
            }
        }
       
        return arr;
    }
}