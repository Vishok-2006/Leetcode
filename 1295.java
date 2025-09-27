class Solution {
    public int findNumbers(int[] nums) {
       int even=0;
       int l;
       int c=0;
       for(int i=0;i<nums.length;i++){
          l=nums[i];
          while(l!=0){
      c++;
      l/=10;
          }
          
          if(c%2==0){
            even++;

          }
          c=0;
       }
       return even; 
    }
}