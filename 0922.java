class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0;
        int j=1;
    
        int a[]=new int[nums.length];
        for(int o=0;o<nums.length;o++){
            if(nums[o]%2==0){
                a[i]=nums[o];
                i+=2;
            }
            else{
                a[j]=nums[o];
                j+=2;
            }
        }
        
           return a;  
    }
}
