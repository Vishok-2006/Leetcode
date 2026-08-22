class Solution {
    public boolean checkDivisibility(int n) {
        int t=n;
        int s=0;
        int p=1;
        while(t>0){
           int r=t%10;
           s+=r;
           p*=r;
           t/=10;
        }
        if(n%(s+p)==0) return true;

       return false; 
    }
}