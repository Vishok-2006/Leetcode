class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[]=new int[nums.length];
        int k=0;
        int j=n;
   int i=0;
       while(k<n){
        a[i]=nums[k];
        a[i+1]=nums[j];
        i=i+2;
        j++;
        k++;
       }
       return a;
    }
}
