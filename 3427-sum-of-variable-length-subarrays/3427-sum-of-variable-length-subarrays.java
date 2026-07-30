class Solution {
    public int subarraySum(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            int k= Math.max(0,i-nums[i]);
            int s=0;
            for(int j=k;j<=i;j++){
              s+=nums[j];
            }
            n+=s;
        }
        return n;
    }
}