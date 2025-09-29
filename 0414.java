class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length-1==1){
            return Math.max(nums[0],nums[1]);
        }
        int min=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[min]){
                min=i;;
            }
        }
        int a=nums[min];
        int b=nums[min];
        int c=nums[min];
        int i=0;
        int t=0;
        while(i<nums.length){
            if(nums[i]>c&&nums[i]!=b&&nums[i]!=a){
                c=nums[i];
            }
            if(c>b){
                t=b;
                b=c;
                c=t;
            }
            if(b>a){
                t=a;
                a=b;
                b=t;
            }
            i++;
        }
        if(a==b||b==c){
            return a;
        }
        return c;

    }
}