class Solution {
    public boolean isPalindrome(int x) {
        int a=0;
        int n=x;
        int sum=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            a=x%10;
            sum=(sum*10)+a;
            x=x/10;

        }
        
        return  sum==n;
    }
}