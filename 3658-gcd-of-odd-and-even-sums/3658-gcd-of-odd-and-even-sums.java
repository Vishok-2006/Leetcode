class Solution {
    public int gcdOfOddEvenSums(int n) {
        int o=0;
        int e=0;
        for(int i=1;i<=n*2;i++){
            if( i%2==0) e+=i;
            else o+=i;
        }
        while(e!=0){
            int t=e;
            e=o%e;
            o=t;
        }
        return o;
    }
}