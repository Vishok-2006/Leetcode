class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        char[] c=num.toCharArray();
        int lq=0;
        int rq=0;
        int ls=0;
        int rs=0;
        int i=0;
        int j=n-1;
        while(i<=j){
           if(c[i]!='?' && i < j ){
                  ls+=c[i]-'0';
            }
            else {
                 lq++;
            }
              if(c[j]!='?' && i<j){
                  rs+=c[j]-'0';
            }
            else {
                rq++;
            }
           i++;
           j--;
        }
       int qd = lq-rq;
       int sd=ls-rs;
       if(qd %2!=0){
        return true;
       }

       return sd != -9 * qd / 2;

    }
}