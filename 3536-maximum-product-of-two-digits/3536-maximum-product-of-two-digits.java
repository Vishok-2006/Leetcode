class Solution {
    public int maxProduct(int s) {
        int res=0;
        List<Integer> arr=new ArrayList<>();
        int n=0;
        while(s>0){
            int r=s%10;
            arr.add(r);
            s/=10;
            n++;
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr.get(i)*arr.get(j)>res){
                    res=arr.get(i)*arr.get(j);
                }
            }
        }
        return res;
    }
}