class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int ans =0;
        Boolean b=false;
        int v=0;
        while(i<prices.length-1){
            if (b==false&&prices[i]<prices[i+1]){
                 b=true;
                 v=prices[i];
                 i++;
            }
            else if(b==true&&prices[i]>prices[i+1]){
                 b=false;
                 ans+=prices[i]-v;
                 i++;

            }
            else{
                 i++;

            }
        }
        if(b==true){
            ans+=prices[prices.length-1]-v;
        }
        return ans;
    }
}