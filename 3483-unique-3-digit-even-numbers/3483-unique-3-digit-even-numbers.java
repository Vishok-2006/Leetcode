class Solution {
    public int totalNumbers(int[] arr) {
     
        int n=arr.length;
        List<Integer> l=new ArrayList<>();
        int[] c=new int[10];
        for(int i: arr){
            c[i]++;
        }
        for(int i=100;i<999;i++){
            int [] t=c.clone();
            int x=i;
            int a=x%10;
            x/=10;
            int b=x%10;
            x/=10;
            int m=x;
            if(--t[a]<0) {
               
                continue;
            }
            if(--t[b]<0) {
               
                continue;
            }
            if(--t[m]<0) {
             
                continue;
            }
            if(i%2==0){
           l.add(i);
            }
            
        }
       
      return l.size();
    }
}